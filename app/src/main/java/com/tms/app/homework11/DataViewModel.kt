package com.tms.app.homework11

import androidx.lifecycle.*
import com.tms.app.homework11.database.DataDao
import com.tms.app.homework11.database.DataEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DataViewModel(
    private val dataRepository: DataRepository,
): ViewModel() {
    val liveData: LiveData<List<Data>> = dataRepository.getData().asLiveData()
    private var iterator = 0L
    private lateinit var messageMain:String
    private lateinit var dao: DataDao

    fun showMessage(){
        val data = DataEntity(
            id = iterator++,
            message = messageMain,
            date = System.currentTimeMillis().toString()
        )

        viewModelScope.launch(Dispatchers.Main) {
            dao.insertData(data)
        }

    }

    fun deleteMes(){
        val trashData = DataEntity(
            id = iterator++,
            message = messageMain,
            date = System.currentTimeMillis().toString()
        )
        viewModelScope.launch(Dispatchers.Main) {
            dao.deleteData(trashData)
        }

    }


    fun getMessage(message: String):String{
        messageMain = message
        return messageMain
    }

    fun getDao(dataDao: DataDao):DataDao{
        dao = dataDao
        return dao
    }



}
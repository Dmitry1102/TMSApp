package com.tms.app.homework16

import android.app.Application
import androidx.room.Room
import com.tms.app.homework16.database.DataBase
import com.tms.app.homework16.database.DataDao

class MainApplication: Application() {

    private val dataBase: DataBase by lazy {
        Room
            .databaseBuilder(applicationContext, DataBase::class.java,"message_database")
            .build()
    }

    val dataDao: DataDao by lazy { dataBase.dataDao() }

    val dataRepository: DataRepository by lazy { DataRepository(dataDao)}
}
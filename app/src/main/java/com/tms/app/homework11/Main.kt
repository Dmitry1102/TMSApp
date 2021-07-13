package com.tms.app.homework11

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.tms.app.databinding.ActivityRecordBinding
import com.tms.app.homework11.database.DataDao
import com.tms.app.homework11.database.DataEntity
import com.tms.app.homework11.recycler.Adapter

class Main : AppCompatActivity() {
    private val application = MainApplication()
    private val dataRepository = DataRepository(application.dataDao)
    private val dataViewModel = DataViewModel(dataRepository)
    private lateinit var binding: ActivityRecordBinding
    private val adapter = Adapter()
    private val viewModel: DataViewModel by viewModels{
        MessageViewModel((application as MainApplication).dataRepository)
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        dataViewModel.getDao(application.dataDao)


        binding.btnAddMes.setOnClickListener{
            dataViewModel.showMessage()
        }

        binding.btnDelMes.setOnClickListener{
            dataViewModel.deleteMes()
        }

        dataViewModel.getMessage(binding.etWrite.text.toString())

        binding.rvShowMes.layoutManager=
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvShowMes.adapter = adapter
        viewModel.liveData.observe(this, {
            adapter.update(it as MutableList<Data>) })
    }





}
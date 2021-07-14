package com.tms.app.homework12

import android.os.Binder
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.tms.app.databinding.ActivityServerBinding
import com.tms.app.homework17.MainApplication
import com.tms.app.homework17.MainViewModel
import com.tms.app.homework17.MainViewModelFactory
import com.tms.app.homework17.data.Crypto
import com.tms.app.homework17.recycle.MainAdapter
import com.tms.app.homework17.restApi.CryptoApi
import com.tms.app.homework17.restApi.CryptoRepository
import com.tms.app.homework17.restApi.CryptoService
import com.tms.app.homework7.Registry

class Main: AppCompatActivity() {

    private lateinit var binding: ActivityServerBinding
    private val viewModel: MainViewModel by viewModels {
        MainViewModelFactory((application as MainApplication).cryptoRepository)
    }
    private val listCrypto: MutableList<Crypto> = mutableListOf()
    private val mainAdapter = MainAdapter(listCrypto)
    private val cryptoService = CryptoService
    private val cryptoRepository = CryptoRepository(cryptoService.getCryptoService())
    private lateinit var text: String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityServerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding.rvCurrency){
            adapter  = mainAdapter
            layoutManager = LinearLayoutManager(this@Main)

        }

        viewModel.liveData.observe(this,{mainAdapter.update(it as MutableList<Crypto>)})

        text = binding.etCurrency.text.toString()

        val limit = cryptoRepository.getLimit(makeInt(this.text))

        binding.btnCurrency.setOnClickListener{
            cryptoRepository.limit = limit
        }



    }

    fun makeInt(text: String):Int = text.toInt()

}
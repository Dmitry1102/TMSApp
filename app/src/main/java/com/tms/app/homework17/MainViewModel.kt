package com.tms.app.homework17

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.tms.app.homework17.data.Crypto
import com.tms.app.homework17.restApi.CryptoRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class MainViewModel(
    private val cryptoRepository: CryptoRepository
): ViewModel() {

    val liveData: MutableLiveData<List<Crypto>> = MutableLiveData()

    init {
        viewModelScope.launch(Dispatchers.Main) {
            val cryptoList = async { cryptoRepository.getCurrencyList() }.await()
            liveData.value = cryptoList
        }

    }

}

class MainViewModelFactory(
    private val cryptoRepository: CryptoRepository
):ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainViewModel(cryptoRepository) as T
    }

}
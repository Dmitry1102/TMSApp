package com.tms.app.homework13

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class MainViewModel: ViewModel() {

    val candyLiveData: MutableLiveData<MutableList<Candy>> = MutableLiveData()

    init{
        getSynchronizedData()
    }

    override fun onCleared() {
        super.onCleared()
    }

    fun getSynchronizedData() {
        val candyFactory = CandyFactory
        candyLiveData.value = candyFactory.getCandiesList()
    }



}
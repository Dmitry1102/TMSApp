package com.tms.app.homework10

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class MainModel: ViewModel() {

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
package com.tms.app.homework8

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ActivityListModel() : ViewModel() {

    val candyLiveData: MutableLiveData<MutableList<Candy>> = MutableLiveData()

    init {
        getSynchronizedData()
    }

    override fun onCleared() {
        super.onCleared()
    }

    fun getSynchronizedData() {
        val candyBuild = CandyBuild
        candyLiveData.value = candyBuild.getCandiesList()

    }


}

package com.tms.app.homework8

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ActivityListModel(
    private val listCandies: MutableList<Candy> = mutableListOf()
) : ViewModel() {
     val candyLiveData: MutableLiveData<MutableList<Candy>> = MutableLiveData()

    override fun onCleared() {
        super.onCleared()
    }

    fun getSynchronizedData(): MutableList<Candy> {
        val candyBuild = CandyBuild
        return candyLiveData.value = candyBuild.getCandiesList()

    }










}
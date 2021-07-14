package com.tms.app.homework16

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MessageViewModel(
    private val dataRepository: DataRepository,
): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return DataViewModel(dataRepository) as T
    }
}
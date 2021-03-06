package com.tms.app.homework16.recycler

import androidx.recyclerview.widget.RecyclerView
import com.tms.app.databinding.ItemRecordBinding
import com.tms.app.homework16.Data
import com.tms.app.homework16.database.DataEntity

class ViewHolder(
    private val binding: ItemRecordBinding
): RecyclerView.ViewHolder(binding.root) {

    fun bind(data: Data){
        binding.tvMessage.text = data.message
        binding.tvMessage.text = data.date
    }

    fun delMessage(data: Data){
        val delData = (data as? DataEntity)

    }
}
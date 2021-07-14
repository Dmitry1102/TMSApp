package com.tms.app.homework17.recycle

import androidx.recyclerview.widget.RecyclerView
import com.tms.app.databinding.ActivityServerBinding
import com.tms.app.databinding.ItemServerBinding
import com.tms.app.homework17.data.Crypto

class MainViewHolder(
    private val binding: ItemServerBinding
): RecyclerView.ViewHolder(binding.root) {

    fun bind(crypto: Crypto){
        binding.tvCurrency.text = crypto.name
        binding.tvCurrency.text = crypto.id.toString()
        binding.tvCurrency.text = crypto.rank.toString()
    }
}
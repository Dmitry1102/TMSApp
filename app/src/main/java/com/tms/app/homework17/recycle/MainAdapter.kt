package com.tms.app.homework17.recycle

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tms.app.databinding.ItemServerBinding
import com.tms.app.homework17.data.Crypto

class MainAdapter(
    private val cryptoList: MutableList<Crypto>
): RecyclerView.Adapter<MainViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(
            ItemServerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bind(cryptoList[position])
    }

    override fun getItemCount(): Int {
        return cryptoList.size
    }

    fun update(crypto: MutableList<Crypto>){
        cryptoList.clear()
        cryptoList.addAll(crypto)
        notifyDataSetChanged()
    }


}
package com.tms.app.homework10

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tms.app.databinding.ItemCandyListBinding

class MainAdapter(
    private val candyList: MutableList<Candy> = mutableListOf(),
    private val onClick: (candy:Candy) -> Unit
): RecyclerView.Adapter<MainViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(
            ItemCandyListBinding.inflate(LayoutInflater.from(parent.context),parent,false),
            onClick
        )
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bind(candyList[position])
    }

    override fun getItemCount(): Int {
        return candyList.size
    }

}
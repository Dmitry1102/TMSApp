package com.tms.app.homework10

import androidx.recyclerview.widget.RecyclerView
import com.tms.app.databinding.ItemCandiesBinding
import com.tms.app.databinding.ItemCandyListBinding

class MainViewHolder(
    private val binding: ItemCandyListBinding,
    private val onClick: (candy:Candy)-> Unit
): RecyclerView.ViewHolder(binding.root)
{
    fun bind(item: Candy){
        itemView.setOnClickListener{
            onClick(item)
        }
        binding.tvCodes.text = item.code.toString()

    }

}
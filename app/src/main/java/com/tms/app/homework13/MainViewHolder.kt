package com.tms.app.homework13

import androidx.recyclerview.widget.RecyclerView
import com.tms.app.databinding.ItemCandyListBinding
import com.tms.app.homework13.homework14.SharedPrefsUtils

class MainViewHolder(
    private val binding: ItemCandyListBinding,
    private val onClick: (candy:Candy)-> Unit
): RecyclerView.ViewHolder(binding.root)
{
    fun bind(item: Candy){
        itemView.setOnClickListener{
            SharedPrefsUtils.putBrand(AdditionalFragment.CANDY_KEY, item.brand)
            SharedPrefsUtils.putCode(AdditionalFragment.CANDY_KEY,item.code)
            onClick(item)
        }
        binding.tvCodes.text = item.code.toString()

    }

}
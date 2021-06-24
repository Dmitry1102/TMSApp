package com.tms.app.homework8

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.tms.app.R
import com.tms.app.databinding.ItemCandiesBinding
import kotlin.coroutines.coroutineContext

class CandiesAdapter(
    private val candyList: MutableList<Candy>
) : RecyclerView.Adapter<CandiesAdapter.CandiesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CandiesViewHolder {
        val binding = ItemCandiesBinding.inflate(LayoutInflater.from(parent.context))
        return CandiesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CandiesViewHolder, position: Int) {
        holder.bind(candyList[position])

    }

    override fun getItemCount(): Int {
        return candyList.size

    }

    fun update(candies: MutableList<Candy>) {
        candyList.clear()
        candyList.addAll(candies)
        notifyDataSetChanged()

    }


    class CandiesViewHolder(
        private val bindingView: ItemCandiesBinding
    ) : RecyclerView.ViewHolder(bindingView.root) {


        fun bind(item: Candy) {
            bindingView.tvCandies.text = item.brand
            bindingView.tvCode.text = item.code.toString()
            if (bindingView.tvCandies.text == "snickers") {
                Glide
                    .with()
                    .load("https://i.pinimg.com/236x/3f/31/ef/3f31ef63da2c1652a77a6655a8e67e17.jpg")
                    .into(bindingView.ivBrand)
            } else if (bindingView.tvCandies.text == "mars") {
                Glide
                    .with()
                    .load("https://www.confitelia.com/3091-thickbox_default/mars-chocolate-bar-51-g.jpg")
                    .into(bindingView.ivBrand)
            } else if (bindingView.tvCandies.text == "twix") {
                Glide
                    .with()
                    .load("https://i5.walmartimages.com/asr/34c1cb63-7580-483b-991c-156197ef060f_1.296d81d6a60ef48ced65a00abad5cb61.jpeg?odnWidth=612&odnHeight=612&odnBg=ffffff")
                    .into(bindingView.ivBrand)
            }
        }


    }
}


}
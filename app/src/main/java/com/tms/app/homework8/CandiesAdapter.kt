package com.tms.app.homework8

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.tms.app.R

class CandiesAdapter(
    private val candiesList1: List<Candy>
): RecyclerView.Adapter<CandiesAdapter.CandiesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CandiesViewHolder {
       val layoutInflater = LayoutInflater.from(parent.context)
       val view = layoutInflater.inflate(R.layout.item_candies,parent,false)
       return CandiesViewHolder(view)
    }

    override fun onBindViewHolder(holder: CandiesViewHolder, position: Int) {
        holder.bind(candiesList1[position])
    }

    override fun getItemCount(): Int {
        return candiesList1.size
    }

    class CandiesViewHolder(
        itemView: View
    ): RecyclerView.ViewHolder(itemView){
        private val tvCandy: TextView = itemView.findViewById(R.id.tv_candies)
        private val tvCode:TextView = itemView.findViewById(R.id.tv_code)

        fun bind(item: Candy){
            tvCandy.text = item.brand
            tvCode.text = item.code.toString()

        }
    }
}
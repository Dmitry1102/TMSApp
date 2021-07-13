package com.tms.app.homework11.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tms.app.databinding.ItemRecordBinding
import com.tms.app.homework11.Data
import com.tms.app.homework11.database.DataEntity

class Adapter(
    private val message: MutableList<Data> = mutableListOf()
): RecyclerView.Adapter<ViewHolder>()  {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemRecordBinding.inflate(LayoutInflater.from(parent.context),parent,false),
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(message[position])
    }

    override fun getItemCount(): Int {
        return message.size
    }

    fun update(data: MutableList<Data>) {
        message.clear()
        message.addAll(data)
        notifyDataSetChanged()
    }
}
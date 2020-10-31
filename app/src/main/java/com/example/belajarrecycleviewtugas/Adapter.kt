package com.example.belajarrecycleviewtugas

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.list.view.*

class Adapter(private val list:ArrayList<Kegiatan>) :RecyclerView.Adapter<Adapter.Holder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(LayoutInflater.from(parent.context).inflate(R.layout.list, parent, false))
    }

    override fun getItemCount(): Int =list.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.view.textView.text=list.get(position).name
    }
    class Holder(val view:View): RecyclerView.ViewHolder(view){
        val listJam = arrayOf("07.30", "08.00", "09.00", "10.30", "11.00",
            "14.00", "19.00", "10.00", "11.00", "15.30")
        init {
            itemView.setOnClickListener{
                val posisi: Int=adapterPosition
                Toast.makeText(itemView.context, "Kegiatan ke ${posisi+1} pada jam ${listJam[posisi]}", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
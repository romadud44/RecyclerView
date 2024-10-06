package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val things: MutableList<Thing>) : RecyclerView.Adapter<CustomAdapter.ThingViewHolder>() {
    class ThingViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val nameTV: TextView = itemView.findViewById(R.id.nameTV)
        val infoTV: TextView = itemView.findViewById(R.id.infoTV)
        val imageIV: ImageView = itemView.findViewById(R.id.imageViewIV)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ThingViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ThingViewHolder(itemView)
    }

    override fun getItemCount(): Int = things.size

    override fun onBindViewHolder(holder: ThingViewHolder, position: Int) {
        val thing = things[position]
        holder.nameTV.text = thing.name
        holder.infoTV.text = thing.info
        holder.imageIV.setImageResource(thing.image)
    }
}
package com.example.latihan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.latihan.model.Prog
import com.example.latihan.model.progdata.listProg

class ListProgAdapter (private val listPres: ArrayList<Prog>) : RecyclerView.Adapter<ListProgAdapter.PresViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PresViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_prog, parent, false)
        return PresViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listProg.size
    }

    override fun onBindViewHolder(holder: PresViewHolder, position: Int) {
        val food= listProg[position]
        holder.tvName.text=food.name
        holder.tvDetail.text=food.detail
        Glide.with(holder.itemView.context)
            .load(food.poster)
            .into(holder.imgPoster)
    }

    inner class PresViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPoster: ImageView = itemView.findViewById(R.id.img_item_poster)
    }
}
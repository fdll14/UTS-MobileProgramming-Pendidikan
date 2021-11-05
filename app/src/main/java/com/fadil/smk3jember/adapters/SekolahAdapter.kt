package com.fadil.smk3jember.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.smk3jember.databinding.ListMenuBinding
import com.fadil.smk3jember.models.Sekolah

class SekolahAdapter(private val listMenu: ArrayList<Sekolah>,
                     private val listener : onSekolahClick
): RecyclerView.Adapter<SekolahAdapter.SekolahViewholder>() {

    inner class SekolahViewholder(val binding: ListMenuBinding) : RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SekolahViewholder {
        return SekolahViewholder(ListMenuBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: SekolahViewholder, position: Int) {
        holder.binding.apply {
            Glide.with(holder.itemView.context)
                .load(listMenu[position].image)
                .into(holder.binding.Thumbnail)

            Title.text = listMenu[position].name
        }
        holder.itemView.setOnClickListener {
            listener.onItemCick(listMenu[position])
        }
    }

    override fun getItemCount(): Int {
        return listMenu.size
    }

    interface onSekolahClick{
        fun onItemCick(sekolah: Sekolah)
    }
}
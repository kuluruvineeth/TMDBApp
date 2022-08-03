package com.kuluruvineeth.tmdbapp.presentation.tvshows

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.kuluruvineeth.tmdbapp.R
import com.kuluruvineeth.tmdbapp.data.model.tvshow.TvShow
import com.kuluruvineeth.tmdbapp.databinding.ListItemBinding

class TvShowAdapter(): RecyclerView.Adapter<MyViewHolder>() {
    private val tvshowList = ArrayList<TvShow>()

    fun setList(tvshows: List<TvShow>){
        tvshowList.clear()
        tvshowList.addAll(tvshows)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = DataBindingUtil.inflate<ListItemBinding>(
            layoutInflater,
            R.layout.list_item,
            parent,
            false
        )
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(tvshowList[position])
    }

    override fun getItemCount(): Int {
        return tvshowList.size
    }
}

class MyViewHolder(val binding: ListItemBinding) :
    RecyclerView.ViewHolder(binding.root){

    fun bind(tvshow: TvShow){
        binding.titleTextView.text = tvshow.name
        binding.descriptionTextView.text = tvshow.overview
        val posterURL = "https://image.tmdb.org/t/p/w500"+tvshow.posterPath
        Glide.with(binding.imageView.context)
            .load(posterURL)
            .into(binding.imageView)
    }
}
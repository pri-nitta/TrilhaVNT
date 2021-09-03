package com.prinitta.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(
    private val list: List<Music>,
    private val onItemClickListener: ItemClickListener
) : RecyclerView.Adapter<MusicViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_music, parent, false)
        return MusicViewHolder(view)
    }

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        val music = list[position]
        holder.bind(music, onItemClickListener)
    }

    override fun getItemCount(): Int = list.size

}

class MusicViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
    fun bind(music: Music, onItemClickListener: ItemClickListener) {
        view.apply {
            setOnClickListener {onItemClickListener.onClick(music)}
            findViewById<TextView>(R.id.music_name).text = music.name
            findViewById<TextView>(R.id.music_singer).text = music.singer
            findViewById<TextView>(R.id.music_length).text = music.length
        }
    }
}

fun interface ItemClickListener {
    fun onClick(music: Music)
}

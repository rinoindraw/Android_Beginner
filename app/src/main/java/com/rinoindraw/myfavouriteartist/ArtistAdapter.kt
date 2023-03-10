package com.rinoindraw.myfavouriteartist

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ArtistAdapter(private val context: Context, private val artist: List<Artist>, val listener: (Artist) -> Unit)
    : RecyclerView.Adapter<ArtistAdapter.ArtistViewHolder>() {

    class ArtistViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgArtist = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameArtist = view.findViewById<TextView>(R.id.tv_item_name)
        val descArtist = view.findViewById<TextView>(R.id.tv_item_description)
        val readMore = view.findViewById<TextView>(R.id.tv_read_more)

        fun bindView(artist: Artist, listener: (Artist) -> Unit){
            imgArtist.setImageResource(artist.imgArtist)
            nameArtist.text = artist.nameArtist
            descArtist.text = artist.descArtist
            readMore.text = artist.readMore

            itemView.setOnClickListener {
                listener(artist)}

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtistViewHolder {
        return ArtistViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_artist, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ArtistViewHolder, position: Int) {
        holder.bindView(artist[position], listener)
    }

    override fun getItemCount(): Int = artist.size

}
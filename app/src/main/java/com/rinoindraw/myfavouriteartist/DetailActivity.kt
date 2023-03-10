package com.rinoindraw.myfavouriteartist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

@Suppress("DEPRECATION")
class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val artist = intent.getParcelableExtra<Artist>(MainActivity.INTENT_PARCELABLE)

        val imgArtist = findViewById<ImageView>(R.id.img_item_photo)
        val nameArtist = findViewById<TextView>(R.id.tv_item_name)
        val descArtist = findViewById<TextView>(R.id.tv_item_description)

        imgArtist.setImageResource(artist?.imgArtist!!)
        nameArtist.text = artist.nameArtist
        descArtist.text = artist.descArtist

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}
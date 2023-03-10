package com.rinoindraw.myfavouriteartist

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Artist(
    val imgArtist: Int,
    val nameArtist: String,
    val descArtist: String,
    val readMore: String = "Read More..."
)   : Parcelable

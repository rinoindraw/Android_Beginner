package com.rinoindraw.myfavouriteartist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatDelegate
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)


        val artistList = listOf<Artist>(
            Artist(
                R.drawable.tswiftt,
                "Taylor Swift",
                "Taylor Swift is an American pop and country music singer-songwriter. Five of her songs, including “Shake It Off” (2014), “Blank Space” (2014), and “Look What You Made Me Do” (2017), topped the Billboard Hot 100. She received a number of awards for her music."
            ),
            Artist(
                R.drawable.arctc,
                "Arctic Monkeys",
                "Arctic Monkeys is an indie rock band formed in Sheffield, South Yorkshire, England in 2002 after meeting at Stocksbridge High School. The band consists of Alex Turner (vocals, guitar, piano), Jamie Cook (guitar), Nick O'Malley (backing vocals, bass) and Matt Helders (drums, vocals)."
            ),
            Artist(
                R.drawable.edsheran,
                "Ed Sheeran",
                "Ed Sheeran is a singer/songwriter who began playing guitar at a young age and soon after started writing his own songs. When he was just a teenager, he moved to London to pursue his music, and his outpouring of creativity added up to several early EPs and hundreds of live shows."
            ),
            Artist(
                R.drawable.chicago,
                "Chicago",
                "Chicago is an American rock band formed in Chicago, Illinois, in 1967. The group began calling themselves the Chicago Transit Authority in 1968, then shortened the name in 1969. Self-described as a \"rock and roll band with horns\", Chicago's songs often combine elements of classical music, jazz, R&B, and pop music."
            ),
            Artist(
                R.drawable.ovrdrgo,
                "Olivia Rodrigo",
                "Olivia Rodrigo, in full Olivia Isabel Rodrigo, (born February 20, 2003, Murrieta, California, U.S.), American singer, songwriter, and actress who first gained popularity with a role on the television show High School Musical: The Musical—The Series (2019–) and who later launched a successful music career."
            ),
            Artist(
                R.drawable.beegees,
                "The Bee Gees",
                "The Bee Gees were a musical group formed in 1958 by brothers Barry, Robin, and Maurice Gibb. The trio were especially successful in popular music in the late 1960s and early 1970s, and later as prominent performers in the disco music era in the mid- to late 1970s."
            ),
            Artist(
                R.drawable.rex,
                "Rex Orange County",
                "Alex O'Connor, also known as Rex Orange County, is a gifted singer/songwriter known for his literate, quirky brand of bedroom pop that combines jazz, hip-hop, and soul influences. O'Connor was still a teenager when he first gained attention online in 2015 for his self-produced album bcos u will never b free."
            ),
            Artist(
                R.drawable.nckdp,
                "Neck Deep",
                "Neck Deep is a pop punk band. Their sound has been described as being reminiscent of Blink-182, New Found Glory, The Wonder Years, Green Day, and the Descendents. Vocalist Ben Barlow has stated A Day to Remember and Architects as a massive influence on the band."
            ),
            Artist(
                R.drawable.smplpln,
                "Simple Plan",
                "Simple Plan's musical style has been described as pop punk, alternative rock, pop rock, power pop, emo, and punk rock. Atlantic Records marketing material has described the band's style as having \"classic punk energy and modern pop sonics\"."
            ),
            Artist(
                R.drawable.oasis,
                "Oasis",
                "Oasis were an English rock band formed in Manchester in 1991. Originally known as the Rain, the group initially consisted of Liam Gallagher (lead vocals, tambourine), Paul Arthurs (guitar), Paul McGuigan (bass guitar) and Tony McCarroll (drums)."
            ),
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_artist)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ArtistAdapter(this, artistList){
                val intent = Intent (this, DetailActivity::class.java)
                intent.putExtra(INTENT_PARCELABLE, it)
                startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_toolbar, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val iconClick = item.itemId

        if (iconClick == R.id.profile_icon){

            val intent = Intent(this, ProfileActivity::class.java)
            this.startActivity(intent)
            return true
        }

        return super.onOptionsItemSelected(item)
    }

}
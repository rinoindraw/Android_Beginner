package com.rinoindraw.myfavouriteartist

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatDelegate

@SuppressLint("CustomSplashScreen")
class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        val imageLogo = findViewById<ImageView>(R.id.logo_titlebar)
        imageLogo.alpha = 0f
        imageLogo.animate().setDuration(1500).alpha(1f).withEndAction {
            val intentSplash = Intent(this, MainActivity::class.java)
            startActivity(intentSplash)
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
            finish()
        }

    }
}
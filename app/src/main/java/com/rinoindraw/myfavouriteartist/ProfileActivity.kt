package com.rinoindraw.myfavouriteartist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

@Suppress("DEPRECATION")
class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.subtitle = "My Profile"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}
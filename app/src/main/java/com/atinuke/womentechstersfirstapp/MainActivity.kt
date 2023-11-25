package com.atinuke.womentechstersfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var joinNowButton: Button = findViewById(R.id.joinNowBtn)

        joinNowButton.setOnClickListener{
            joinNowNavigation()
        }
    }

    private fun joinNowNavigation() {
            val intent = Intent(this@MainActivity, LoginActivity::class.java)

        // Start the LoginActivity
        startActivity(intent)
    }
}
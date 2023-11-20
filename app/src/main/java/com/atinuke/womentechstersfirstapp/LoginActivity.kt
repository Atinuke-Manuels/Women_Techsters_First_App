package com.atinuke.womentechstersfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var backButton: Button = findViewById(R.id.backBtn)

        backButton.setOnClickListener{
            // Create an Intent to navigate to the LoginActivity
            val intent = Intent(this@LoginActivity, MainActivity::class.java)

            // Start the LoginActivity
            startActivity(intent)
        }
    }
}
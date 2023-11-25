package com.atinuke.womentechstersfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class CreateNewAccountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_new_account)

        var haveAccount: TextView = findViewById(R.id.alreadyHaveAcct)

        haveAccount.setOnClickListener{
            funHaveAccount()
        }
    }

    private fun funHaveAccount() {
        var i = Intent(this, LoginActivity::class.java)
        startActivity(i)
    }
}
package com.atinuke.womentechstersfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.util.Patterns
import com.google.android.material.snackbar.Snackbar

class ForgotPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        var loginBtn: TextView = findViewById(R.id.header4)

        loginBtn.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)

            startActivity(intent)
        }


        val sendBtn: Button = findViewById<Button>(R.id.send)
        val emailAdd: EditText = findViewById<EditText>(R.id.email)

        sendBtn.setOnClickListener {
            val userEmail: String = emailAdd.text.toString().trim()
            var message = " "

            if (userEmail.isEmpty()) {
                message = "Please enter an email address"
            } else if (!isValidEmail(userEmail)) {
                message = "Please enter a valid email address"
            } else {
                message = "An email has been sent to $userEmail"
            }

            Snackbar.make(sendBtn, message, Snackbar.LENGTH_LONG).show()
        }


    }

    // Function to validate email using regex
    private fun isValidEmail(email: String): Boolean {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }
}
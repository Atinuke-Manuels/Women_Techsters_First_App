package com.atinuke.womentechstersfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import java.lang.Error

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var loginButton: Button = findViewById(R.id.login_button)
        var userName: EditText = findViewById(R.id.username)
        var password: EditText = findViewById(R.id.password)

        loginButton.setOnClickListener{
            val userNameInput: String = userName.text.toString().trim()
            val passwordInput: String = password.text.toString().trim()

            var errorMessage = " "

            if(userNameInput.isEmpty() and passwordInput.isEmpty()){
                errorMessage = "Enter your username and password"
            }
            else if(userNameInput.isEmpty()){
                errorMessage = "Username cannot be blank"
            }else if( passwordInput.isEmpty()){
                errorMessage = "Password cannot be blank"
            }else {
                var intent = Intent(this, HomeActivity::class.java)

                startActivity(intent)
            }
            Snackbar.make(loginButton, errorMessage, Snackbar.LENGTH_LONG).show()
        }



        var forgot: TextView = findViewById(R.id.forgot_password)

        forgot.setOnClickListener{
            val intent = Intent(this, ForgotPasswordActivity::class.java)

            startActivity(intent)
        }

        var newAccount: TextView = findViewById(R.id.newAccount)

        newAccount.setOnClickListener{
            var i = Intent(this, CreateNewAccountActivity::class.java)

            startActivity(i)
        }
    }
}
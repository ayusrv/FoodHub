package com.example.foodhub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Login : AppCompatActivity() {

    lateinit var etMobileNumber:EditText
    lateinit var etPassword:EditText
    lateinit var btnLogin:Button
    lateinit var txtForgotPass:TextView
    lateinit var etRegister:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        supportActionBar?.hide()

        etMobileNumber = findViewById(R.id.etMobileNumber)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)
        txtForgotPass = findViewById(R.id.txtForgotPass)
        etRegister = findViewById(R.id.etRegister)

        btnLogin.setOnClickListener{
            Toast.makeText(this@Login,"Login clicked",Toast.LENGTH_LONG).show()

            val intent = Intent(this@Login,HomeActivity::class.java)
            startActivity(intent)
        }
        txtForgotPass.setOnClickListener{
            Toast.makeText(this@Login,"Forgot Password clicked",Toast.LENGTH_LONG).show()

            val intent = Intent(this@Login,ForgotPass::class.java)
            startActivity(intent)
        }
        etRegister.setOnClickListener{
            Toast.makeText(this@Login,"Register clicked",Toast.LENGTH_LONG).show()

            val intent = Intent(this@Login,Register::class.java)
            startActivity(intent)
        }
    }
}
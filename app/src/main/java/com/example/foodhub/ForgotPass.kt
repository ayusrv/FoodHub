package com.example.foodhub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class ForgotPass : AppCompatActivity() {
    lateinit var etMobileNumber:EditText
    lateinit var etPassword:EditText
    lateinit var btnNext:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_pass)
        supportActionBar?.hide()
        etMobileNumber = findViewById(R.id.etMobileNumber)
        etPassword = findViewById(R.id.etPassword)
        btnNext = findViewById(R.id.btnNext)

        btnNext.setOnClickListener{
            Toast.makeText(this@ForgotPass,"Login clicked", Toast.LENGTH_LONG).show()

            val intent = Intent(this@ForgotPass,HomeActivity::class.java)
            startActivity(intent)
        }
    }
}

package com.example.foodhub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        supportActionBar?.hide()
    }
}
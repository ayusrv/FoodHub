package com.example.foodhub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash)
        supportActionBar?.hide()

        Handler().postDelayed({
            val intent = Intent(this@MainActivity,Login::class.java)
            startActivity(intent)
        },3000)
    }
}


package com.example.originalapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        aviationButton.setOnClickListener {
            println("こんにちは！")
            val intent = Intent(applicationContext, EnglishContentsActivity::class.java)
            startActivity(intent)
        }
    }
}
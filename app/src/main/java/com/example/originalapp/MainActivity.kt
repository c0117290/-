package com.example.originalapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sample1()
    }

    private fun sample1() {
        print("sample1を表示する")
    }

    // TODO: レイアウトめっちゃエラー出てるよ。要修正
}
package com.example.originalapp

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.english_contents_activity.*

class EnglishContentsActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.english_contents_activity)
        init("title_num")
    }
    /**
     * 前の画面から値を受け取る。
     * 受け取った値で動的な画面設定を作成する
     */
    private fun init(key:String) {
        val title_num = intent.getIntExtra(key, 0)

        /** 条件分岐 */
        if (key === "title_num") {
            if (title_num == 0) {
                titleImageView.setImageResource(R.drawable.airport_img)
            } else if (title_num == 1) {
                titleImageView.setImageResource(R.drawable.hoteru_img)
            } else if (title_num == 2) {
                titleImageView.setImageResource(R.drawable.move_img)
            } else {
                titleImageView.setImageResource(R.drawable.aviation)
                Log.d("例外", "title_numの値が不正な値です")
            }
        }
    }
}
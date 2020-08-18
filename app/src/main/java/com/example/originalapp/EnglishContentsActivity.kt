package com.example.originalapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.english_contents_activity.*

class EnglishContentsActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.english_contents_activity)
        //元からある機能
        init("title_num")
        //自分で作った機能
    }
    /**
     * 前の画面から値を受け取る。
     * 受け取った値で動的な画面設定を作成する
     */
    private fun init(key:String) {
        val title_num = intent.getIntExtra(key, 0)
        main_text.text = "お水を頂けますか?"
        en_main_text.text ="Can I have some water"
        t_main_text.text ="暖かい飲み物を頂けますか?"
        tnt_main_text.text ="Could I have something hot to drink"
        th_main_text.text ="シートを倒してもいいですか?"
        thnt_main_text.text ="May I recline seat?"

        next_button.setOnClickListener{
            main_text.text = "魚料理/肉料理をお願いします"
            en_main_text.text="I'd like fish/meat,please"
            t_main_text.text ="オレンジジュースをください"
            tnt_main_text.text ="I'd like orange juice, please"
            th_main_text.text ="コーヒーをお願いします。砂糖とミルクもください。"
            thnt_main_text.text ="Coffee, please. With some sugar and milk."

        }

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
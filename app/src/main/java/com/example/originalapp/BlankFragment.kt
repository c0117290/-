package com.example.originalapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_blank.*

// FIXME: ダメだよここに宣言しては
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class BlankFragment : Fragment() {
    // ここから
    // スライドショーで表示する画像の配列の定数
    private val PHOTO_RES_IDS = intArrayOf(R.drawable.aviation, R.drawable.hotel, R.drawable.move)

    // 今どの写真を表示しているかを管理するためのメンバ変数
    private var index = 0
    //ここまで

    private var param1: String? = null
    private var param2: String? = null

    // TODO: ←はやるべきことを示します。

    override fun onCreate(savedInstanceState: Bundle?) {


        // FIXME: コピペでしょ！？IDがきちんとついてないよ。レイアウト側に
        //ここから
        imageView.setOnClickListener(this)
        nextButton.setOnClickListener(this)
        backButton.setOnClickListener(this)
        //ここまで

        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    // TODO: コピペ絶対ダメ。わからなくなる原因
    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            BlankFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }


            }
    }
}
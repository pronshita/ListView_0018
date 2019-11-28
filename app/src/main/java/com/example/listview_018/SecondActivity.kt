package com.example.listview_018

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        setTitle("Trice")

        val title = intent.extras?.getString(MainActivity().KEY_TITLE,"")
        val result = intent.extras?.getString(MainActivity().KEY_REULT)

        tv_title.setText(title)
        tv_result.setText("${result}")

        btn_back.setOnClickListener {
            finish()
        }
    }
}
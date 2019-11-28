package com.example.listview_018

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val titleArr = arrayOf(
        "coffee"
        ,"Espresso"
        ,"Cappuccino"
        ,"Iced Coffee Soya"
        ,"Black Coffee",
        "Hot cappuccino",
        "Fresh milk",
        "chocolate",
        "Lychee Juice",
        "Kiwi smoothie"
    )
    val priceArr = arrayOf(50, 45, 45, 45, 50,45, 50, 50, 60, 100)
    val context = this

    public final val KEY_TITLE = "TITLE"
    public final val KEY_REULT = "RESULT"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setTitle("menu Drink")

        val mAdp = ArrayAdapter(context, android.R.layout.simple_list_item_1, titleArr)
        lv_result.adapter = mAdp

        lv_result.setOnItemClickListener { parent, view, position, id ->
            val goPageResult = Intent(context, SecondActivity::class.java)

            goPageResult.putExtra(KEY_TITLE, titleArr[position])
            goPageResult.putExtra(KEY_REULT, priceArr[position])

            startActivity(goPageResult)
        }
    }
}


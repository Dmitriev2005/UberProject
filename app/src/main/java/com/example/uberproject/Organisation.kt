package com.example.uberproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity




class Organisation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_organisation)
        //startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=Всероссийское общество инвалидов орска, ул. Оренбургская обл., Россия 462281 + ГБУСО РЦ для инвалидов Бодрость в г. Медногорске&z=15")))
        //startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=51.50513994963561, 57.58898447284456 + 51.783542638425004, 55.11113977278834&z=15")))
    }
}
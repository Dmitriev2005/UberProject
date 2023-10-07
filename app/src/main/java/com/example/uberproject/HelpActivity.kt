package com.example.uberproject

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class HelpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)
    }
    fun callEducation(view: View){ //Образование+
        val phoneNumber = "tel:8 3532 77-01-36"
        val intent = Intent(Intent.ACTION_DIAL)
        intent.data = Uri.parse(phoneNumber)
        startActivity(intent)
    }
    fun callWork(view: View){ //Работа
        val phoneNumber = "tel:8 3532 77-01-36"
        val intent = Intent(Intent.ACTION_DIAL)
        intent.data = Uri.parse(phoneNumber)
        startActivity(intent)
    }
    fun callCare(view: View){ //Уход
        val phoneNumber = "tel:+7 3532 29-32-99"
        val intent = Intent(Intent.ACTION_DIAL)
        intent.data = Uri.parse(phoneNumber)
        startActivity(intent)
    }
    fun callSpeedHelp(view: View){ //Вызов скорой
        val phoneNumber = "tel:103"
        val intent = Intent(Intent.ACTION_DIAL)
        intent.data = Uri.parse(phoneNumber)
        startActivity(intent)
    }
    fun loadBackActivity(view:View){
        startActivity(Intent(this,GeneralMenu::class.java))
    }

}
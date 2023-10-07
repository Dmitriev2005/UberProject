package com.example.uberproject

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class GeneralMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_general_menu)
    }
    public fun LoadActivity(view:View){
        when(view.id){
            R.id.btnRentalAndBuy->startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://mfhc.ru/")))
            R.id.btnPhysicalExercise->startActivity(Intent(this,PhysicalExercieseActivity::class.java))
            R.id.btnOrganisation->startActivity(Intent(this,Organisation::class.java))
            R.id.btnHelp->startActivity(Intent(this,HelpActivity::class.java))
        }
    }
}
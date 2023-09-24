package com.example.uberproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class GeneralMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_general_menu)
    }
    public fun LoadActivity(view:View){
        when(view.id){
            R.id.btnRentalAndBuy->startActivity(Intent(this,RentalAndBuyActivity::class.java))
            R.id.btnPhysicalExercise->startActivity(Intent(this,PhysicalExercieseActivity::class.java))
            R.id.btnOrganisation->startActivity(Intent(this,Organisation::class.java))
            R.id.btnHelp->startActivity(Intent(this,HelpActivity::class.java))
        }
    }
}
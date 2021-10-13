package com.example.rest20.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.rest20.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun saladsBtnClicked(view: android.view.View) {
        Intent(this, SaladsAktivity::class.java).apply { startActivity(this) }
    }
    fun mdBtnClicked(view: android.view.View) {
        Intent(this, MainDishesAktivity::class.java).apply { startActivity(this) }
    }
    fun dessertsBtnClicked(view: android.view.View) {
        Intent(this, DesertsActivity::class.java).apply { startActivity(this) }
    }
}
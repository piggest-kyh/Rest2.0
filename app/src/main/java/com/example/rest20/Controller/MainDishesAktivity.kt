package com.example.rest20.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.rest20.Adapter.DishAdapter
import com.example.rest20.R
import com.example.rest20.Services.FakeDB

class MainDishesAktivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_dishes)
        var listView = findViewById<RecyclerView>(R.id.main_dishes_recycle_view)
        var apdater = DishAdapter(this, FakeDB.mainDishes)
        listView.adapter = apdater
        listView.layoutManager = LinearLayoutManager(this)

         }
    }

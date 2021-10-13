package com.example.rest20.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.rest20.Adapter.DishAdapter
import com.example.rest20.Model.Dish
import com.example.rest20.R
import com.example.rest20.Services.FakeDB
import java.util.*

class SaladsAktivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_salads)
        var listView = findViewById<RecyclerView>(R.id.dishes_recycle_view)
        var apdater = DishAdapter(this, FakeDB.salads)
        listView.adapter = apdater
        listView.layoutManager = LinearLayoutManager(this)

    }
}
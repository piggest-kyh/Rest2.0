package com.example.rest20.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.rest20.Adapter.DishAdapter
import com.example.rest20.R
import com.example.rest20.Services.FakeDB

class DesertsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deserts)
        var listView = findViewById<RecyclerView>(R.id.desserts_dishes_recycle_view)
        var apdater = DishAdapter(this, FakeDB.desserts)
        listView.adapter = apdater
        listView.layoutManager = LinearLayoutManager(this)
    }
}
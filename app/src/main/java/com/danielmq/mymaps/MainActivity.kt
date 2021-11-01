package com.danielmq.mymaps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.danielmq.mymaps.models.UserMap

class MainActivity : AppCompatActivity() {
    private lateinit var rvMaps: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvMaps = findViewById(R.id.rvMaps)
        // Set layout manager on recycler view
        rvMaps.layoutManager = LinearLayoutManager(this)
        // Set adapter on recycler view
        rvMaps.adapter = MapsAdapter(this, emptyList<UserMap>())
    }
}
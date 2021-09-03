package com.prinitta.recyclerview

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val onClickListener = ItemClickListener { music ->
            Toast.makeText(this, "Playing: ${music.name}", Toast.LENGTH_LONG).show()
        }

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        val adapter = Adapter(MusicList().loadItems(), onClickListener)
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter

    }
}
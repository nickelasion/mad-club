package com.example.madclub

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FeedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feed)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        val users = listOf(
            UserItem("Bahram", "Musician", "Tehran"),
            UserItem("Sara", "Singer", "Shiraz"),
            UserItem("Harmony Academy", "Academy", "Isfahan"),
            UserItem("Sound Records", "Company", "Tehran")
        )

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = UserAdapter(users)
    }
}
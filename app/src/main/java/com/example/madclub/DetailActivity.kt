package com.example.madclub

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvName = findViewById<TextView>(R.id.tvName)
        val tvRole = findViewById<TextView>(R.id.tvRole)
        val tvCity = findViewById<TextView>(R.id.tvCity)

        tvName.text = intent.getStringExtra("name")
        tvRole.text = "Role: " + intent.getStringExtra("role")
        tvCity.text = "City: " + intent.getStringExtra("city")
    }
}
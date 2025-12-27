package com.example.madclub

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class RoleSelectActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_role_select)

        val btnMusician = findViewById<Button>(R.id.btnMusician)
        val btnAcademy = findViewById<Button>(R.id.btnAcademy)
        val btnCompany = findViewById<Button>(R.id.btnCompany)

        btnMusician.setOnClickListener {
            openProfile("Musician")
        }

        btnAcademy.setOnClickListener {
            openProfile("Academy")
        }

        btnCompany.setOnClickListener {
            openProfile("Company")
        }
    }

    private fun openProfile(role: String) {
        val intent = Intent(this, FeedActivity::class.java)
        intent.putExtra("USER_ROLE", role)
        startActivity(intent)
    }
}
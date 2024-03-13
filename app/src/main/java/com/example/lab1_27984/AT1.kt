package com.example.lab1_27984

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AT1 : AppCompatActivity() {

    private lateinit var nextPageBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_at1)

        nextPageBtn = findViewById(R.id.nextPage)
        nextPageBtn.setOnClickListener{
            startActivity(Intent(this@AT1,AT2::class.java))
        }
    }
}
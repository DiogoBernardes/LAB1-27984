package com.example.lab1_27984

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AT2 : AppCompatActivity() {

    private lateinit var closeBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_at2)

        closeBtn = findViewById<Button>(R.id.close)
        closeBtn.setOnClickListener {
            finishAffinity()
        }
    }
}
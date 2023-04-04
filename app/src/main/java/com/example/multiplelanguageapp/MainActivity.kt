package com.example.multiplelanguageapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnButton.setOnClickListener {
            Toast.makeText(applicationContext,R.string.toast,Toast.LENGTH_SHORT).show()
        }
    }
}
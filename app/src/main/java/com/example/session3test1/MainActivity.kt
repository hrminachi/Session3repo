package com.example.session3test1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.tv1)
        val button  = findViewById<Button>(R.id.butn1)

        button?.setOnClickListener {
            textView.setText("Testing")
        }
    }
}
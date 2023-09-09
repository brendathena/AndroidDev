package com.example.peoplecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val inBtn = findViewById<Button>(R.id.`in`)
        val outBtn = findViewById<Button>(R.id.out)
        var display = findViewById<TextView>(R.id.counter)
        var counter = 0
        
        inBtn.setOnClickListener { 
            counter++
            display.text = counter.toString()
            Toast.makeText(this, "A costumer arrived.", Toast.LENGTH_SHORT).show()
        }
        outBtn.setOnClickListener { 
            counter--
            if (counter < 0) { counter = 0 }
            display.text = counter.toString()
            Toast.makeText(this, "A costumer left.", Toast.LENGTH_SHORT).show()
        }
    }
}
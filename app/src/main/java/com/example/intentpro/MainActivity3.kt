package com.example.intentpro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.intentpro.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    lateinit var binding: ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val date = this.intent.getStringExtra("date")
        val weather = this.intent.getStringExtra("weather")

        binding.ivweather.setOnClickListener {
            Toast.makeText(applicationContext, "${date} ${weather}", Toast.LENGTH_SHORT).show()
        }
    }
}
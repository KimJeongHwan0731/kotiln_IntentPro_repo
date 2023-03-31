package com.example.intentpro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentpro.databinding.ActivityMain5Binding

class MainActivity5 : AppCompatActivity() {
    lateinit var binding: ActivityMain5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val x = intent.getIntExtra("x", -2)
        val y = intent.getIntExtra("y", -2)
        val operator = intent.getStringExtra("operator")
        var sum = 0

        when (operator) {
            "+" -> sum = x + y
            "-" -> sum = x - y
            "*" -> sum = x * y
            "%" -> sum = x % y
        }

        binding.btnReturnActivity2.setOnClickListener {
            intent.putExtra("sum", sum)
            setResult(RESULT_OK, intent) // startActivity와 동일함
            finish()
        }
    }
}
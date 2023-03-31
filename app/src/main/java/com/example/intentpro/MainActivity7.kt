package com.example.intentpro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentpro.databinding.ActivityMain6Binding
import com.example.intentpro.databinding.ActivityMain7Binding

class MainActivity7 : AppCompatActivity() {
    lateinit var binding: ActivityMain7Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain7Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val x = intent.getIntExtra("x", -4)
        val y = intent.getIntExtra("y", -4)
        val operator = intent.getStringExtra("operator")
        var sum = 0

        when (operator) {
            "+" -> sum = x + y
            "-" -> sum = x - y
            "*" -> sum = x * y
            "%" -> sum = x % y
        }
        binding.tvX.text = x.toString()
        binding.tvY.text = "${y}"
        binding.tvDiv.text = sum.toString()

        binding.btnReturnMain.setOnClickListener {
            intent.putExtra("sum", sum)
            setResult(RESULT_OK, intent) // startActivity와 동일함
            finish()
        }
    }
}
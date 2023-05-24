package com.yluisf.examenpractico

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yluisf.examenpractico.databinding.ActivityMainBinding
import com.yluisf.examenpractico.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var nameResult: String = intent.extras?.getString("KEY").orEmpty()
        var dateResult: String = intent.extras?.getString("KEY2").orEmpty()
        var rolResult: String = intent.extras?.getString("KEY3").orEmpty()
        initComponents(nameResult, dateResult, rolResult)
    }

    private fun initComponents(nameResult: String, dateResult: String, rolResult: String) {
        binding.tvResultName.text = nameResult
        binding.tvResultDate.text = dateResult
        binding.tvResultRol.text = rolResult

        binding.btnBack.setOnClickListener { onBackPressed() }
    }
}
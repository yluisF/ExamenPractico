package com.yluisf.examenpractico

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.addTextChangedListener
import com.yluisf.examenpractico.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initListeners()
    }

    private fun initListeners() {


        binding.btnSentTo.setOnClickListener {
            var txtName = binding.etName.text.toString()
            var txtDate = binding.etBirthday.text.toString()
            var txtRol = binding.etRol.text.toString()

            if (txtName.isNotEmpty() || txtDate.isNotEmpty() || txtRol.isNotEmpty()) {

                navigateToResult(txtName, txtDate, txtRol)

            }


        }
    }

    private fun navigateToResult(txtName: String, txtDate: String, txtRol: String) {
        val intent = Intent(this, ResultActivity::class.java)
        intent.putExtra("KEY", txtName)
        intent.putExtra("KEY2", txtDate)
        intent.putExtra("KEY3", txtRol)
        startActivity(intent)
    }
}
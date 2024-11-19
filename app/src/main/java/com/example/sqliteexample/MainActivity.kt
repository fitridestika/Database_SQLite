package com.example.sqliteexample

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.sqliteexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnTambah.setOnClickListener {
            startActivity(Intent(this@MainActivity,
                CreateActivity::class.java))
        }
        binding.btnUpdate.setOnClickListener {
            startActivity(Intent(this@MainActivity,
                UpdateActivity::class.java))
        }
    }
}

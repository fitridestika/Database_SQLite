package com.example.sqliteexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.sqliteexample.databinding.ActivityCreateBinding

class CreateActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCreateBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}
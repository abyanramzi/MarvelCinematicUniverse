package com.arc.mcu.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arc.mcu.databinding.ActivityFilm15Binding
import com.arc.mcu.databinding.ActivityFilm1Binding

class Film15 : AppCompatActivity() {
    lateinit var binding : ActivityFilm15Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFilm15Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
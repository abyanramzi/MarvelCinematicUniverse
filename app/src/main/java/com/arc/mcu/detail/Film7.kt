package com.arc.mcu.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arc.mcu.databinding.ActivityFilm1Binding
import com.arc.mcu.databinding.ActivityFilm7Binding

class Film7 : AppCompatActivity() {
    lateinit var binding : ActivityFilm7Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFilm7Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
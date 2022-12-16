package com.arc.mcu.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arc.mcu.databinding.ActivityFilm1Binding
import com.arc.mcu.databinding.ActivityFilm8Binding

class Film8 : AppCompatActivity() {
    lateinit var binding : ActivityFilm8Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFilm8Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
package com.arc.mcu.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arc.mcu.databinding.ActivityFilm17Binding
import com.arc.mcu.databinding.ActivityFilm18Binding
import com.arc.mcu.databinding.ActivityFilm1Binding

class Film17 : AppCompatActivity() {
    lateinit var binding : ActivityFilm17Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFilm17Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
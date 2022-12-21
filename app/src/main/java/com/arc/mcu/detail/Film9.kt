package com.arc.mcu.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arc.mcu.databinding.ActivityFilm1Binding
import com.arc.mcu.databinding.ActivityFilm9Binding

class Film9 : AppCompatActivity() {
    lateinit var binding : ActivityFilm9Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFilm9Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
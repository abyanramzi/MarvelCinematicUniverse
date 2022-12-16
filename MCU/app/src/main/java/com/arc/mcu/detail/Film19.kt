package com.arc.mcu.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arc.mcu.databinding.ActivityFilm19Binding
import com.arc.mcu.databinding.ActivityFilm1Binding

class Film19 : AppCompatActivity() {
    lateinit var binding : ActivityFilm19Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFilm19Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
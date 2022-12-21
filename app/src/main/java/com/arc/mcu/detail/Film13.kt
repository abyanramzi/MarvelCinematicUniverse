package com.arc.mcu.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arc.mcu.databinding.ActivityFilm13Binding
import com.arc.mcu.databinding.ActivityFilm1Binding

class Film13 : AppCompatActivity() {
    lateinit var binding : ActivityFilm13Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFilm13Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
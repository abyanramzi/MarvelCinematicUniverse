package com.arc.mcu.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arc.mcu.databinding.ActivityFilm14Binding
import com.arc.mcu.databinding.ActivityFilm15Binding
import com.arc.mcu.databinding.ActivityFilm1Binding

class Film14 : AppCompatActivity() {
    lateinit var binding : ActivityFilm14Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFilm14Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
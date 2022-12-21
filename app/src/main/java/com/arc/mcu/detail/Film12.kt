package com.arc.mcu.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arc.mcu.databinding.ActivityFilm12Binding
import com.arc.mcu.databinding.ActivityFilm1Binding

class Film12 : AppCompatActivity() {
    lateinit var binding : ActivityFilm12Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFilm12Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
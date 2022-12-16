package com.arc.mcu.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arc.mcu.databinding.ActivityFilm10Binding
import com.arc.mcu.databinding.ActivityFilm1Binding

class Film10 : AppCompatActivity() {
    lateinit var binding : ActivityFilm10Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFilm10Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
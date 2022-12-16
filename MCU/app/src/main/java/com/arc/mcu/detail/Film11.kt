package com.arc.mcu.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arc.mcu.databinding.ActivityFilm11Binding
import com.arc.mcu.databinding.ActivityFilm1Binding

class Film11 : AppCompatActivity() {
    lateinit var binding : ActivityFilm11Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFilm11Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
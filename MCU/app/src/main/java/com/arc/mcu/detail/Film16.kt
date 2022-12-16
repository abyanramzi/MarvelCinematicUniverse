package com.arc.mcu.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arc.mcu.databinding.ActivityFilm16Binding
import com.arc.mcu.databinding.ActivityFilm1Binding

class Film16 : AppCompatActivity() {
    lateinit var binding : ActivityFilm16Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFilm16Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
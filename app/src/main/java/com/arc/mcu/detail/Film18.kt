package com.arc.mcu.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arc.mcu.databinding.ActivityFilm18Binding
import com.arc.mcu.databinding.ActivityFilm1Binding

class Film18 : AppCompatActivity() {
    lateinit var binding : ActivityFilm18Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFilm18Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
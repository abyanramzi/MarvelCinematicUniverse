package com.arc.mcu.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arc.mcu.databinding.ActivityFilm1Binding
import com.arc.mcu.databinding.ActivityFilm6Binding

class Film6 : AppCompatActivity() {
    lateinit var binding : ActivityFilm6Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFilm6Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
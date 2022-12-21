package com.arc.mcu.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arc.mcu.databinding.ActivityFilm1Binding

class Film1 : AppCompatActivity() {
    lateinit var binding : ActivityFilm1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFilm1Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
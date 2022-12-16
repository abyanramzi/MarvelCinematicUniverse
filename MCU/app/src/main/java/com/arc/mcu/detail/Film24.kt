package com.arc.mcu.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arc.mcu.databinding.ActivityFilm1Binding
import com.arc.mcu.databinding.ActivityFilm24Binding
import com.arc.mcu.databinding.ActivityFilm2Binding

class Film24 : AppCompatActivity() {
    lateinit var binding : ActivityFilm24Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFilm24Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
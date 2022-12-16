package com.arc.mcu.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arc.mcu.databinding.ActivityFilm1Binding
import com.arc.mcu.databinding.ActivityFilm2Binding
import com.arc.mcu.databinding.ActivityFilm3Binding
import com.arc.mcu.databinding.ActivityFilm4Binding

class Film4 : AppCompatActivity() {
    lateinit var binding : ActivityFilm4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFilm4Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
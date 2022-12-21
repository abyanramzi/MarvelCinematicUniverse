package com.arc.mcu.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arc.mcu.databinding.ActivityFilm1Binding
import com.arc.mcu.databinding.ActivityFilm21Binding
import com.arc.mcu.databinding.ActivityFilm2Binding

class Film21 : AppCompatActivity() {
    lateinit var binding : ActivityFilm21Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFilm21Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
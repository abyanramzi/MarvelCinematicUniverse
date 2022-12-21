package com.arc.mcu.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arc.mcu.databinding.ActivityFilm1Binding
import com.arc.mcu.databinding.ActivityFilm23Binding
import com.arc.mcu.databinding.ActivityFilm2Binding

class Film23 : AppCompatActivity() {
    lateinit var binding : ActivityFilm23Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFilm23Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
package com.arc.mcu.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arc.mcu.databinding.ActivityFilm1Binding
import com.arc.mcu.databinding.ActivityFilm22Binding
import com.arc.mcu.databinding.ActivityFilm2Binding

class Film22 : AppCompatActivity() {
    lateinit var binding : ActivityFilm22Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFilm22Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
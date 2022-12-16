package com.arc.mcu.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arc.mcu.databinding.ActivityFilm1Binding
import com.arc.mcu.databinding.ActivityFilm27Binding
import com.arc.mcu.databinding.ActivityFilm2Binding

class Film27 : AppCompatActivity() {
    lateinit var binding : ActivityFilm27Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFilm27Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
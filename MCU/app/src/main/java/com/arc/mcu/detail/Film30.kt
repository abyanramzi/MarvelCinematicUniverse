package com.arc.mcu.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arc.mcu.databinding.ActivityFilm1Binding
import com.arc.mcu.databinding.ActivityFilm2Binding
import com.arc.mcu.databinding.ActivityFilm30Binding

class Film30 : AppCompatActivity() {
    lateinit var binding : ActivityFilm30Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFilm30Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
package com.arc.mcu.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arc.mcu.databinding.ActivityFilm1Binding
import com.arc.mcu.databinding.ActivityFilm28Binding
import com.arc.mcu.databinding.ActivityFilm2Binding

class Film28 : AppCompatActivity() {
    lateinit var binding : ActivityFilm28Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFilm28Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
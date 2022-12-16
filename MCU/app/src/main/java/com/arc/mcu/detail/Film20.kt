package com.arc.mcu.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arc.mcu.databinding.ActivityFilm1Binding
import com.arc.mcu.databinding.ActivityFilm20Binding

class Film20 : AppCompatActivity() {
    lateinit var binding : ActivityFilm20Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFilm20Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
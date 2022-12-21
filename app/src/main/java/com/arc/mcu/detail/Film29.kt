package com.arc.mcu.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arc.mcu.databinding.ActivityFilm1Binding
import com.arc.mcu.databinding.ActivityFilm29Binding
import com.arc.mcu.databinding.ActivityFilm2Binding

class Film29 : AppCompatActivity() {
    lateinit var binding : ActivityFilm29Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFilm29Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
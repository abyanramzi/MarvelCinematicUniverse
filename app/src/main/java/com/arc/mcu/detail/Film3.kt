package com.arc.mcu.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arc.mcu.databinding.ActivityFilm1Binding
import com.arc.mcu.databinding.ActivityFilm2Binding
import com.arc.mcu.databinding.ActivityFilm3Binding

class Film3 : AppCompatActivity() {
    lateinit var binding : ActivityFilm3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFilm3Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
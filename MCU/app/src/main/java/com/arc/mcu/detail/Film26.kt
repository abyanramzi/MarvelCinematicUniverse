package com.arc.mcu.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arc.mcu.databinding.ActivityFilm1Binding
import com.arc.mcu.databinding.ActivityFilm26Binding
import com.arc.mcu.databinding.ActivityFilm2Binding

class Film26 : AppCompatActivity() {
    lateinit var binding : ActivityFilm26Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFilm26Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
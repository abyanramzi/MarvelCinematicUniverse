package com.arc.mcu.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arc.mcu.databinding.ActivityFilm1Binding
import com.arc.mcu.databinding.ActivityFilm25Binding
import com.arc.mcu.databinding.ActivityFilm2Binding

class Film25 : AppCompatActivity() {
    lateinit var binding : ActivityFilm25Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFilm25Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
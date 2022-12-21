package com.arc.mcu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arc.mcu.databinding.ActivityMainBinding
import com.arc.mcu.detail.*

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val film1 = binding.listfilm1
        val film2 = binding.listfilm2
        val film3 = binding.listfilm3
        val film4 = binding.listfilm4
        val film5 = binding.listfilm5
        val film6 = binding.listfilm6
        val film7 = binding.listfilm7
        val film8 = binding.listfilm8
        val film9 = binding.listfilm9
        val film10 = binding.listfilm10
        val film11 = binding.listfilm11
        val film12 = binding.listfilm12
        val film13 = binding.listfilm13
        val film14 = binding.listfilm14
        val film15 = binding.listfilm15
        val film16 = binding.listfilm16
        val film17 = binding.listfilm17
        val film18 = binding.listfilm18
        val film19 = binding.listfilm19
        val film20 = binding.listfilm20
        val film21 = binding.listfilm21
        val film22 = binding.listfilm22
        val film23 = binding.listfilm23
        val film24 = binding.listfilm24
        val film25 = binding.listfilm25
        val film26 = binding.listfilm26
        val film27 = binding.listfilm27
        val film28 = binding.listfilm28
        val film29 = binding.listfilm29
        val film30 = binding.listfilm30

        film1.setOnClickListener(){
            val intent = Intent(this, Film1::class.java)
            startActivity(intent)
        }
        film2.setOnClickListener(){
            val intent = Intent(this, Film2::class.java)
            startActivity(intent)
        }
        film3.setOnClickListener(){
            val intent = Intent(this, Film3::class.java)
            startActivity(intent)
        }
        film4.setOnClickListener(){
            val intent = Intent(this, Film4::class.java)
            startActivity(intent)
        }
        film5.setOnClickListener(){
            val intent = Intent(this, Film5::class.java)
            startActivity(intent)
        }
        film6.setOnClickListener(){
            val intent = Intent(this, Film6::class.java)
            startActivity(intent)
        }
        film7.setOnClickListener(){
            val intent = Intent(this, Film7::class.java)
            startActivity(intent)
        }
        film8.setOnClickListener(){
            val intent = Intent(this, Film8::class.java)
            startActivity(intent)
        }
        film9.setOnClickListener(){
            val intent = Intent(this, Film9::class.java)
            startActivity(intent)
        }
        film10.setOnClickListener(){
            val intent = Intent(this, Film10::class.java)
            startActivity(intent)
        }
        film11.setOnClickListener(){
            val intent = Intent(this, Film11::class.java)
            startActivity(intent)
        }
        film12.setOnClickListener(){
            val intent = Intent(this, Film12::class.java)
            startActivity(intent)
        }
        film13.setOnClickListener(){
            val intent = Intent(this, Film13::class.java)
            startActivity(intent)
        }
        film14.setOnClickListener(){
            val intent = Intent(this, Film14::class.java)
            startActivity(intent)
        }
        film15.setOnClickListener(){
            val intent = Intent(this, Film15::class.java)
            startActivity(intent)
        }
        film16.setOnClickListener(){
            val intent = Intent(this, Film16::class.java)
            startActivity(intent)
        }
        film17.setOnClickListener(){
            val intent = Intent(this, Film17::class.java)
            startActivity(intent)
        }
        film18.setOnClickListener(){
            val intent = Intent(this, Film18::class.java)
            startActivity(intent)
        }
        film19.setOnClickListener(){
            val intent = Intent(this, Film19::class.java)
            startActivity(intent)
        }
        film20.setOnClickListener(){
            val intent = Intent(this, Film20::class.java)
            startActivity(intent)
        }
        film21.setOnClickListener(){
            val intent = Intent(this, Film21::class.java)
            startActivity(intent)
        }
        film22.setOnClickListener(){
            val intent = Intent(this, Film22::class.java)
            startActivity(intent)
        }
        film23.setOnClickListener(){
            val intent = Intent(this, Film23::class.java)
            startActivity(intent)
        }
        film24.setOnClickListener(){
            val intent = Intent(this, Film24::class.java)
            startActivity(intent)
        }
        film25.setOnClickListener(){
            val intent = Intent(this, Film25::class.java)
            startActivity(intent)
        }
        film26.setOnClickListener(){
            val intent = Intent(this, Film26::class.java)
            startActivity(intent)
        }
        film27.setOnClickListener(){
            val intent = Intent(this, Film27::class.java)
            startActivity(intent)
        }
        film28.setOnClickListener(){
            val intent = Intent(this, Film28::class.java)
            startActivity(intent)
        }
        film29.setOnClickListener(){
            val intent = Intent(this, Film29::class.java)
            startActivity(intent)
        }
        film30.setOnClickListener(){
            val intent = Intent(this, Film30::class.java)
            startActivity(intent)
        }
    }
}
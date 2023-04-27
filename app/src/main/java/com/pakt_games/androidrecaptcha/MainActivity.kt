package com.pakt_games.androidrecaptcha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pakt_games.androidrecaptcha.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}
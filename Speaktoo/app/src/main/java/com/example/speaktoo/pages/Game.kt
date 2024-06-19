package com.example.speaktoo.pages

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.speaktoo.databinding.GameBinding

class Game : AppCompatActivity() {
    private lateinit var binding: GameBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = GameBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.arrowGame.setOnClickListener {
            // Close the current activity
            finish()
        }

    }
}
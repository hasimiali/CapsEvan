package com.example.speaktoo

import android.os.Bundle
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.example.speaktoo.databinding.GameBinding
import com.example.speaktoo.databinding.LevelBinding
import com.example.speaktoo.databinding.LoginBinding

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
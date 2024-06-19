package com.example.speaktoo.pages

import android.os.Bundle
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.example.speaktoo.databinding.LevelBinding

class Level : AppCompatActivity() {
    private lateinit var binding: LevelBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LevelBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.level1.setOnClickListener {
            val intent = Intent(this, Game::class.java)
            startActivity(intent)
        }

        binding.arrowLevel.setOnClickListener {
            // Close the current activity
            finish()
        }



    }
}
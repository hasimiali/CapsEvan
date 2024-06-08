package com.example.speaktoo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.speaktoo.databinding.ForgotBinding
import com.example.speaktoo.databinding.SignupBinding

class SignUp : AppCompatActivity() {
    private lateinit var binding: SignupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.arrowSignUp.setOnClickListener {
            // Close the current activity
            finish()
        }

    }
}

package com.example.speaktoo

import android.os.Bundle
import android.content.Intent
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.speaktoo.databinding.LoginBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: LoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.signInLogin.setOnClickListener {
            val intent = Intent(this, Proficiency::class.java)
            startActivity(intent)
        }
    }

    fun goToForget(view: View) {
        // Handle the click event here
        val intent = Intent(this, Forgot::class.java)
        startActivity(intent)
    }

    fun goToSignUp(view: View) {
        // Handle the click event here
        val intent = Intent(this, SignUp::class.java)
        startActivity(intent)
    }


}
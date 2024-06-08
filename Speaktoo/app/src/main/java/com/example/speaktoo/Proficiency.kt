package com.example.speaktoo

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.example.speaktoo.databinding.ProficiencyBinding

class Proficiency : AppCompatActivity() {
    private lateinit var binding: ProficiencyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ProficiencyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.navView.setNavigationItemSelectedListener { menuItem ->
            // Close the sidebar when an item is clicked
            binding.drawerLayout.closeDrawer(GravityCompat.START)

            // Start the corresponding activity based on the clicked item
            when (menuItem.itemId) {
                R.id.nav_profile -> {
                    // Start Profile activity
                    startActivity(Intent(this, Profile::class.java))
                    true
                }
                R.id.nav_logout -> {
                    // Start Profile activity
                    startActivity(Intent(this, MainActivity::class.java))
                    true
                }
                else -> false
            }
        }

        binding.beginnerProficiency.setOnClickListener {
            val intent = Intent(this, Level::class.java)
            startActivity(intent)
        }

        binding.burgerProficiency.setOnClickListener {
            // Open or close the sidebar when the burger icon is clicked
            val drawerLayout = findViewById<DrawerLayout>(R.id.drawer_layout)
            if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
                drawerLayout.closeDrawer(GravityCompat.START)
            } else {
                drawerLayout.openDrawer(GravityCompat.START)
            }
        }
    }


}

package com.thazin.taxidemoapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.thazin.taxidemoapp.databinding.ActivitySearchBinding

class SearchActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySearchBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySearchBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val detailIntent = Intent(this, DetailActivity::class.java)

        binding.back.setOnClickListener {
            val intent = Intent(this, MapsActivity::class.java)
            startActivity(intent)
        }

        binding.layCarOne.setOnClickListener {
            startActivity(detailIntent)
        }

        binding.layCarTwo.setOnClickListener {
            startActivity(detailIntent)
        }

    }
}
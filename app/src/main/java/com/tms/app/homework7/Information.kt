package com.tms.app.homework7

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.tms.app.databinding.ActivityTimerInfoBinding

class Information : AppCompatActivity() {

    private lateinit var binding: ActivityTimerInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTimerInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val textlog = intent.extras?.getString(Registry.TEXT_TO_LOG)
        val textPass = intent.extras?.getString(Registry.TEXT_TO_PASS)

        binding.infoLog.text = textlog
        binding.infoPass.text = textPass

        Glide
            .with(this)
            .load("https://images.unsplash.com/photo-1544717455-4cf7ad978978?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1yZWxhdGVkfDE1fHx8ZW58MHx8fHw%3D&w=1000&q=80")
            .into(binding.imageView)
            

        binding.button2.setOnClickListener() {
            finish()
        }

    }
}
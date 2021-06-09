package com.tms.app.homework7

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.tms.app.R
import com.tms.app.databinding.ActivityMainBinding
import com.tms.app.databinding.ActivityTimerInfoBinding

class Information: AppCompatActivity() {


    private lateinit var  binding: ActivityTimerInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTimerInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val textlog = intent.extras?.getString(Registry.TEXT_TO_LOG)
        val textPass = intent.extras?.getString(Registry.TEXT_TO_PASS)

        binding.infoLog.text = textlog
        binding.infoPass.text = textPass

        binding.button2.setOnClickListener(){
            finish()
        }

    }
}
package com.tms.app.homework7

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.tms.app.R

class Information: AppCompatActivity() {

    lateinit var text1:TextView
     lateinit var text2:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timer_info)

        text1 = findViewById(R.id.info_log)
        text2 = findViewById(R.id.info_pass)

        val textlog = intent.extras?.getString(Registry.TEXT_TO_LOG)
        val textPass = intent.extras?.getString(Registry.TEXT_TO_PASS)

        text1.text = textlog
        text2.text = textPass

    }
}
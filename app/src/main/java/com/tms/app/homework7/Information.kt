package com.tms.app.homework7

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.tms.app.R

class Information: AppCompatActivity() {

    private lateinit var text1:TextView
    private lateinit var text2:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timer_info)

        text1 = findViewById(R.id.info_log)
        text2 = findViewById(R.id.info_pass)

        var registry = Registry()
        text1.text = registry.textLogin.text
//        text2.text = registry.textPass.text



    }
}
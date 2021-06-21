package com.tms.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.tms.app.R
import com.tms.app.homework6.Homework6Activity
import com.tms.app.homework7.Registry
import com.tms.app.homework8.ActivityList

class MainActivity : AppCompatActivity() {

    private lateinit var btn6:Button
    private lateinit var btn7:Button
    private lateinit var btn8:Button

   override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_common)

       btn6 = findViewById(R.id.homework_6)
       btn7 = findViewById(R.id.homework_7)
       btn8 = findViewById(R.id.homework_8)


       btn6.setOnClickListener(){
            startActivity(Intent(this, Homework6Activity::class.java))
       }

       btn7.setOnClickListener(){
           startActivity(Intent(this, Registry::class.java))
       }

       btn8.setOnClickListener(){
            startActivity(Intent(this,ActivityList::class.java))
       }



    }
}
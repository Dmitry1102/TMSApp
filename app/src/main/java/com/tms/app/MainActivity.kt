package com.tms.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.tms.app.R
import com.tms.app.databinding.ActivityCommonBinding
import com.tms.app.homework10.GeneralActivity

import com.tms.app.homework6.Homework6Activity
import com.tms.app.homework7.Registry
import com.tms.app.homework8.ActivityList
import com.tms.app.homework9.FragmentActivity


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCommonBinding

   override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCommonBinding.inflate(layoutInflater)
        setContentView(binding.root)



       binding.homework6.setOnClickListener(){
            startActivity(Intent(this, Homework6Activity::class.java))
       }

       binding.homework7.setOnClickListener(){
           startActivity(Intent(this, Registry::class.java))
       }

       binding.homework8.setOnClickListener(){
            startActivity(Intent(this,ActivityList::class.java))
       }

       binding.homework9.setOnClickListener(){
           startActivity(Intent(this, FragmentActivity::class.java))
       }

       binding.homework10.setOnClickListener(){
           startActivity(Intent(this, GeneralActivity::class.java))
       }

       binding.homework11.setOnClickListener{
           startActivity(Intent(this, com.tms.app.homework11.Main::class.java))
       }

       binding.homework12.setOnClickListener{
           startActivity(Intent(this, com.tms.app.homework12.Main::class.java))
       }



   }
}
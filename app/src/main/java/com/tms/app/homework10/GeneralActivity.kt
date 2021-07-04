package com.tms.app.homework10

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tms.app.databinding.ActivityCandyListBinding
import com.tms.app.databinding.FragmentFirstBinding
import kotlin.random.Random

class GeneralActivity: AppCompatActivity() {

    private lateinit var binding: ActivityCandyListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCandyListBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }




    companion object{
        const val TWIX = "Twix"
        const val SNICKERS = "Snickers"
        const val MARS = "Mars"

        fun buildCode(): Int {
            val code = Random.nextInt(10000000, 99999999)
            return code
        }


    }
}
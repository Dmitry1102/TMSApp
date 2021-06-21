package com.tms.app.homework8

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.tms.app.databinding.ActivityListBinding
import kotlin.properties.Delegates
import kotlin.random.Random

class ActivityList : AppCompatActivity() {

    private lateinit var binding: ActivityListBinding
    private var code by Delegates.notNull<Int>()
    private val listCandy: MutableList<Candy> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        for (i in 0..300) {
             when {
                i < 100 -> {
                    listCandy.add(Candy("snickers", buildCode()))
                }
                i in 101..199 -> {
                    listCandy.add(Candy("mars", buildCode()))
                }
                i in 201..299 -> {
                    listCandy.add(Candy("twix", buildCode()))
                }
            }

        }

        binding.rvCandies.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvCandies.adapter = CandiesAdapter(listCandy)

    }

    private fun buildCode(): Int {
        code = Random.nextInt(10000000, 99999999)
        return code
    }


}
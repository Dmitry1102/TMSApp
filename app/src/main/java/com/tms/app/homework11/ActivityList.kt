package com.tms.app.homework11

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager

import com.tms.app.databinding.ActivityListBinding
import kotlin.properties.Delegates
import kotlin.random.Random

class ActivityList : AppCompatActivity() {

    private lateinit var binding: ActivityListBinding
    private var code by Delegates.notNull<Int>()
    private val activityListModel: ActivityListModel by viewModels()
    private val listCandy: MutableList<Candy> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val candiesAdapter = CandiesAdapter(listCandy)



        binding.rvCandies.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvCandies.adapter = candiesAdapter
        activityListModel.candyLiveData.observe(
            this, { candiesAdapter.update(it) }
        )
    }

    fun buildCode(): Int {
        code = Random.nextInt(10000000, 99999999)
        return code
    }


}
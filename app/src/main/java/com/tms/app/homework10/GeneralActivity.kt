package com.tms.app.homework10

import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tms.app.databinding.ActivityCandyListBinding
import com.tms.app.databinding.FragmentFirstBinding
import com.tms.app.homework10.AdditionalFragment.Companion.PREF_INFO
import kotlin.random.Random

class GeneralActivity: AppCompatActivity() {

    private lateinit var binding: ActivityCandyListBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCandyListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var mainFragment = MainFragment()

        val shared = getSharedPreferences(PREF_INFO, MODE_PRIVATE)



        supportFragmentManager.beginTransaction().add(
            binding.fragmentMain.id, mainFragment, FRAGMENT_TAG ).commit()

    }

    fun openAdditionalFragment(candy: Candy){
        var additionalFragment = AdditionalFragment
        supportFragmentManager.beginTransaction().replace(
            binding.fragmentMain.id, additionalFragment.newInstace(candy), FRAGMENT_TAG
        ).addToBackStack(null).commit()

    }




    companion object{
        const val TWIX = "Twix"
        const val SNICKERS = "Snickers"
        const val MARS = "Mars"
        const val FRAGMENT_TAG = "FRAGMENT_TAG"
        const val ADDITIONAL_FRAGMENT_TAG = "ADDITIONAL_FRAGMENT_TAG"


        fun buildCode(): Int {
            val code = Random.nextInt(10000000, 99999999)
            return code
        }


    }
}
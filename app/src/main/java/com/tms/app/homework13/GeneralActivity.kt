

package com.tms.app.homework13

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tms.app.databinding.ActivityCandyListBinding
import com.tms.app.homework13.AdditionalFragment.Companion.PREF_INFO
import kotlin.random.Random

class GeneralActivity: AppCompatActivity() {

    private lateinit var binding: ActivityCandyListBinding

    

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCandyListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var mainFragment = MainFragment()
        val sharedPreferences = getSharedPreferences(PREF_INFO, MODE_PRIVATE)
        val openBrand = sharedPreferences.getString(PREF_INFO,"No Preferences")
        val openCode = sharedPreferences.getInt(PREF_INFO,0)

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



        fun buildCode(): Int {
            val code = Random.nextInt(10000000, 99999999)
            return code
        }


    }
}
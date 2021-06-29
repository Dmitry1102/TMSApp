package com.tms.app.homework9

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tms.app.R
import com.tms.app.databinding.ColorChangeActvityBinding

class FragmentActivity:AppCompatActivity() {

    private lateinit var binding: ColorChangeActvityBinding

    val firstFragment = FirstFragment()
    val secondFragment = SecondFragment()
    val thirdFragment = ThirdFragment()
    val fourthFragment = FourthFragment()
    val fifthFragment = FifthFragment()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ColorChangeActvityBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.buttonChange.setOnClickListener(
            supportFragmentManager.beginTransaction().apply {
                replace(binding.mainFragment.id, firstFragment,FirstFragment.TAG)
                commit()
            }


        )

    }
}
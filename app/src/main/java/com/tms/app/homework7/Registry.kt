package com.tms.app.homework7

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import com.bumptech.glide.Glide
import com.tms.app.R
import com.tms.app.databinding.ActivityMainBinding
import com.tms.app.databinding.ActivityTimerBinding
import kotlin.properties.Delegates

class Registry : AppCompatActivity() {
    private lateinit var binding: ActivityTimerBinding
    private var convert by Delegates.notNull<Int>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTimerBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button.setOnClickListener(){
            convert = Integer.parseInt(binding.timerShow.text.toString())
            if( convert >= 1 ){
                convert--
                binding.timerShow.text = convert.toString()
            }else {
                binding.button.text = "Enter"
                binding.button.setOnClickListener(){
                    startActivity(Intent(this, Information::class.java).apply{
                        putExtra(TEXT_TO_LOG, binding.firstEdit.text.toString())
                        putExtra(TEXT_TO_PASS, binding.secondEdit.text.toString())
                    })
                binding.timerShow.visibility = View.INVISIBLE
                binding.logView.visibility = View.VISIBLE
                binding.passView.visibility = View.VISIBLE
                binding.firstEdit.visibility = View.VISIBLE
                binding.secondEdit.visibility = View.VISIBLE
                }
            }
        }


        savedInstanceState?.let {
            convert = it.getInt(SAVE_KEY)
            binding.timerShow.text = convert.toString()
        }

    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(SAVE_KEY, convert)
        super.onSaveInstanceState(outState)

    }

    companion object {
        const val TEXT_TO_LOG: String = "Text_To_log"
        const val TEXT_TO_PASS: String = "Text_To_Pass"
        const val SAVE_KEY: String = "SAVE_KEY"

    }


}
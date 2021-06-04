package com.tms.app.homework7

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.tms.app.R

class Registry : AppCompatActivity() {

    private lateinit var click:Button
    private lateinit var textView: TextView
    lateinit var textLogin: TextView
    lateinit var textPass: TextView
    private lateinit var editLog: EditText
    private lateinit var editPass: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timer)

        click = findViewById(R.id.timer_button)
        textView = findViewById(R.id.timer_show)
        textLogin = findViewById(R.id.log_view)
        textPass = findViewById(R.id.pass_view)
        editLog = findViewById(R.id.first_edit)
        editPass = findViewById(R.id.second_edit)

        click.setOnClickListener(){
            val count =textView.text.toString()
            var convert: Int = Integer.parseInt((count))
            if( convert != 0 ){
                convert--
                textView.text = convert.toString()
            }else{
                click.text = "Enter"
                click.setOnClickListener(){
                    startActivity(Intent(this,Information::class.java))
                }
                textView.visibility = View.INVISIBLE
                textLogin.visibility = View.VISIBLE
                textPass.visibility = View.VISIBLE
                editLog.visibility = View.VISIBLE
                editPass.visibility = View.VISIBLE
            }


        }


    }


}
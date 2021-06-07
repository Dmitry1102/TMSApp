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
    private lateinit var textLogin: TextView
    private lateinit var textPass: TextView
    lateinit var editLog: EditText
    lateinit var editPass: EditText


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
                    startActivity(Intent(this,Information::class.java).apply {
                        putExtra(TEXT_TO_LOG,editLog.text.toString())
                        putExtra(TEXT_TO_PASS,editPass.text.toString())
                    })
                }
                textView.visibility = View.INVISIBLE
                textLogin.visibility = View.VISIBLE
                textPass.visibility = View.VISIBLE
                editLog.visibility = View.VISIBLE
                editPass.visibility = View.VISIBLE
            }


        }


    }

    companion object{
        val TEXT_TO_LOG: String = "Text_To_log"
        val TEXT_TO_PASS: String = "Text_To_Pass"

    }




}
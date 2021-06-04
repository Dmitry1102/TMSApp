package com.tms.app.homework7

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.tms.app.R

class Registry : AppCompatActivity() {

    private lateinit var click:Button
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timer)

        click = findViewById(R.id.timer_button)
        textView = findViewById(R.id.timer_show)
        click.setOnClickListener(
            counter(textView)
        )
    }

    fun counter(view:TextView): View.OnClickListener? {
        val count = view.text.toString()
        var convert: Int = Integer.parseInt((count))
        convert--
        view.text = convert.toString()

    }

}
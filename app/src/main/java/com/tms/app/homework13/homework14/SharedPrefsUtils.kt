package com.tms.app.homework13.homework14

import android.content.SharedPreferences

object SharedPrefsUtils {

    lateinit var sharedPrefs: SharedPreferences

    fun putBrand(key: String, value: String){
        sharedPrefs.edit().putString(key,value).apply()
    }

    fun putCode(key: String, value: Int){
        sharedPrefs.edit().putInt(key,value).apply()
    }
}
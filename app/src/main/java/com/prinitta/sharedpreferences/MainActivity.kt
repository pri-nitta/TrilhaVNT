package com.prinitta.sharedpreferences

import android.content.Context
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (firstTime()){
            welcome()
            updateFirstTime()
        }
    }

    private fun firstTime(): Boolean {
        val sharedPref = getPreferences(Context.MODE_PRIVATE)
        return sharedPref.getBoolean(R.string.key_first_time.toString(), true)
    }

    private fun updateFirstTime(){
        val sharedPref = getPreferences(Context.MODE_PRIVATE)
        with(sharedPref.edit()){
            putBoolean(R.string.key_first_time.toString(), false)
            apply()
        }
    }

    private fun welcome(){
        findViewById<TextView>(R.id.welcome).isVisible = true
    }




}
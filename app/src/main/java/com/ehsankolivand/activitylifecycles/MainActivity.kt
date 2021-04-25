package com.ehsankolivand.activitylifecycles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("ActivityLifee","onDestroy")
    }

    override fun onStop() {
        super.onStop()
        Log.i("ActivityLifee","onStop")

    }

    override fun isFinishing(): Boolean {

        Log.i("ActivityLifee","isFinishing")

        return super.isFinishing()
    }
}
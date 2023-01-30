package com.example.val_log

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val value = "여기는 value 입니다!"

        Log.d("MainActivity", value)
//        val value = "여기는 value 입니다!"
//        val value2 = "여기는 value222 입니다!"
    }
}
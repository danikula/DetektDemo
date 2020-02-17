package com.danikula.detektdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.lang.System.gc

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        java.lang.System.gc()
        System.gc()
        gc()
    }
}

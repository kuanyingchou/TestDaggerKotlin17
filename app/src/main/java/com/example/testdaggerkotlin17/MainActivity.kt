package com.example.testdaggerkotlin17

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        val component = DaggerMyComponent.create()
        component.car.start()
    }
}
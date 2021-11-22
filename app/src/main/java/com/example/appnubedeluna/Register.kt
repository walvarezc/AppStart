package com.example.appnubedeluna

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }

    fun onTerms(view: android.view.View) {}
    fun onRegister(view: android.view.View) {}
    fun onReturnLogin(view: android.view.View) {}
}
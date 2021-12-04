package com.example.appnubedeluna
import android.content.ClipData.newIntent
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.material.snackbar.Snackbar


class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

      }
    fun onClick(view: View?) {


    }

    fun onbtn1(view: android.view.View) {
        val miIntent = Intent(this, ProductoActivity::class.java)
        startActivity(miIntent)
    }
    fun onbtn2(view: android.view.View) {
        val miIntent = Intent(this, ProductoActivity::class.java)
        startActivity(miIntent)

    }
    fun onbtn3(view: android.view.View) {
        val miIntent = Intent(this, ProductoActivity::class.java)
        startActivity(miIntent)
    }



}



        

        


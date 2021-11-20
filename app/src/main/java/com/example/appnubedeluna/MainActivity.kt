package com.example.appnubedeluna

import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import android.content.Intent as Intent

class MainActivity : AppCompatActivity() {
    private var edtUsername: EditText? = null
    private var edtPassword: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtUsername = findViewById(R.id.edtUsername)
        edtPassword = findViewById(R.id.edtPassword)

    }

    fun onlogin(botonLogin:View) {
        var username = edtUsername!!.text.toString();
        var password = edtPassword!!.text.toString();

        if (username.isNotEmpty() && password.isNotEmpty()) {

            FirebaseAuth.getInstance().signInWithEmailAndPassword(username, password)
                .addOnCompleteListener {
                    if (it.isSuccessful) {
                        showHome(username)
                    } else {
                        getToast("error al autenticar");
                    }
                }

        } else {
            getToast("error al loguear");
        }

    }
    private fun showHome(username: String) {

        val homeIntent = Intent(this, WelcomeActivity::class.java).apply {
            putExtra("email", username)
        }

        startActivity(homeIntent)

        getToast("wellcome");
    }

    private fun getToast(message: String) {
        Toast.makeText(
            applicationContext,
            message,
            Toast.LENGTH_SHORT
        ).show();
    }
    fun onRegister(view: View) {}


}
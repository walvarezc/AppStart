package com.example.appnubedeluna

import android.content.res.Configuration
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
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
        setSupportActionBar(findViewById(R.id.my_toolbar))

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

        val intento = Intent(this, WelcomeActivity::class.java).apply {
            putExtra("email", username)
        }

        startActivity(intento)

        getToast("wellcome");
    }

    private fun getToast(message: String) {
        Toast.makeText(
            applicationContext,
            message,
            Toast.LENGTH_SHORT
        ).show();
    }
    fun onRegister(view: View) {
        var username = edtUsername!!.text.toString();
        var password = edtPassword!!.text.toString();

        if (username.isNotEmpty() && password.isNotEmpty()) {

            FirebaseAuth.getInstance().createUserWithEmailAndPassword(username, password)
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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main_activity, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean = when (item.itemId) {
        R.id.action_search -> {
            Toast.makeText(this,R.string.txt_action_search, Toast.LENGTH_LONG).show()
            true
        }
        R.id.action_settings -> {
            Toast.makeText(this,R.string.txt_action_settings, Toast.LENGTH_LONG).show()
            true
        }
        R.id.action_logout -> {
            Toast.makeText(this,R.string.txt_action_logout, Toast.LENGTH_LONG).show()
            true
        }
        else -> {
            super.onOptionsItemSelected(item)
        }

    }
    }

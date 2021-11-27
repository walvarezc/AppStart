package com.example.appnubedeluna

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Switch
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.textfield.TextInputLayout
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import java.util.regex.Pattern



class RegisterActivity : AppCompatActivity() {

    private var editUserName: EditText? = null
    private var editPassword: EditText? = null
    private var editName: EditText? = null
    private var editLastName: EditText? = null
    private var editMobile: EditText? = null
    private var stTerms: Switch? = null

    var db = FirebaseFirestore.getInstance()

            override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        editUserName = findViewById(R.id.editUserName);
        editPassword = findViewById(R.id.editPassword);
        editName = findViewById(R.id.editName);
        editLastName = findViewById(R.id.editLastName);
        editMobile = findViewById(R.id.editMobile);
        stTerms = findViewById(R.id.stTerms);



    }

    fun onReturnLogin(view: android.view.View) {}
    fun onRegister(view: android.view.View) {}
    fun onTerms(view: android.view.View) {}


}

    fun onTerms(view: android.view.View) {}
    fun onRegister(view: android.view.View) {}
    fun onReturnLogin(view: android.view.View) {}

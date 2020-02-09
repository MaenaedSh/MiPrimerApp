package com.miprimerapp

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {

    private val usuarioKey= "USER_KEY" //Guarda Valor
    //private val prefs: SharedPreferences?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val prefs = PreferenceManager.getDefaultSharedPreferences(this)


        btnLogin.setOnClickListener{
            //Toast.makeText(applicationContext, "Este es mi primer mensaje",Toast.LENGTH_LONG).show() //Mensaje gris

            //Modo editor
            val editor= prefs.edit()
            editor.putString(usuarioKey, editNombre.text.toString())
            editor.apply()




            val intent = Intent(this,MainActivity::class.java)
            intent.flags= Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
            //finish()

        }
    }
}

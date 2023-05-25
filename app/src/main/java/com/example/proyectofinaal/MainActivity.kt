package com.example.proyectofinaal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun cambiarOrtodoncia(view: View){
        val intent = Intent(this, ortodoncia::class.java)
        startActivity(intent)
    }
    fun cambiarPrincipal(view: View){
        val intent =Intent(this, index::class.java)
        startActivity(intent)
    }
    fun cambiarRegistro(view: View){
        val intent =Intent(this, registro::class.java)
        startActivity(intent)
    }
}
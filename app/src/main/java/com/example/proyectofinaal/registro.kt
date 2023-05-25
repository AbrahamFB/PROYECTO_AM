package com.example.proyectofinaal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class registro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
    }
    fun cambiarPrincipal(view: View){
        val intent = Intent(this, index::class.java)
        startActivity(intent)
    }
}
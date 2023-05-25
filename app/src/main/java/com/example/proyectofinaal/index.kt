package com.example.proyectofinaal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class index : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_index)
    }
    fun cambiarPrincipal(view: View){
        val intent = Intent(this, index::class.java)
        startActivity(intent)
    }
}
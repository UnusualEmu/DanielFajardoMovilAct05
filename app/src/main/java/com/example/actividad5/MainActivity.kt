package com.example.actividad5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Botón para cambiar a la segunda pantalla
        val botonSegundaPantalla = findViewById<Button>(R.id.btnSegPantalla)
        botonSegundaPantalla.setOnClickListener {
            val intent = Intent(this, SegundaPantalla::class.java)
            startActivity(intent)
        }


    }
}
package com.example.actividad5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class SegundaPantalla : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_pantalla)

        // Botón para volver a la primera pantalla
        val btnVolver = findViewById<Button>(R.id.btnVolver)
        btnVolver.setOnClickListener {
            finish() // Termina esta actividad y vuelve a la anterior
        }
    }
}
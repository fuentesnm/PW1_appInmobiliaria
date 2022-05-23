package com.example.inmobiliaria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Consulta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_consulta)

        val enviar: Button = findViewById(R.id.btnEnviar)
        enviar.setOnClickListener {
            Toast.makeText(this, "Su consulta ha sido enviada. Gracias!", Toast.LENGTH_LONG).show()
            this.finish()
        }
    }
}
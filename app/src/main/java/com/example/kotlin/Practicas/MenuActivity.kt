package com.example.kotlin.Practicas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.kotlin.OperasBasicas.OperasActivity
import com.example.kotlin.R



class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_menu)

        val btnSaludo = findViewById<Button>(R.id.btn1)
        val btnIrOperas = findViewById<Button>(R.id.btnIrOperas) // <- nuevo botón

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnSaludo.setOnClickListener {
            Toast.makeText(this, "¡Hola, Luis!", Toast.LENGTH_SHORT).show()
        }
        btnIrOperas.setOnClickListener {
            val intent = Intent(this, OperasActivity::class.java)
            startActivity(intent)
        }
    }
}


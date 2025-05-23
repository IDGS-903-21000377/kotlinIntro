package com.example.kotlin.Practica4

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.kotlin.R
import java.io.FileNotFoundException
import java.nio.file.Files.lines

class ArchivosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_archivos)


        val btnguardar = findViewById<Button>(R.id.saveButton)
        val btnleer = findViewById<Button>(R.id.readButton)
        val btnborrar = findViewById<Button>(R.id.btnBorrar)
        val outpuTtext = findViewById<TextView>(R.id.outputText)
        val inputText = findViewById<EditText>(R.id.inputText)

        btnguardar.setOnClickListener {
            val texto = inputText.text.toString()+"\n"
            val archivo = openFileOutput("datos.txt", MODE_APPEND)

            try {
                archivo.write(texto.toByteArray())
            } catch (e: Exception){
                e.printStackTrace()

            }

        }

        btnleer.setOnClickListener {


            try {
                val contenido = openFileInput("datos.txt").bufferedReader().useLines { lines ->
                    lines.joinToString("\n")

                }
                outpuTtext.text=contenido
            }catch (e: FileNotFoundException){
                outpuTtext.text="archivo no encontrado"


            }catch (e: Exception){
                e.printStackTrace()

            }
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
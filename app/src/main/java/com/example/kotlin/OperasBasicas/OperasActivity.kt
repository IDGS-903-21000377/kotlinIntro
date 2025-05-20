package com.example.kotlin.OperasBasicas

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.kotlin.R

import android.widget.EditText
import android.widget.Button
import android.widget.TextView
import android.widget.RadioGroup
import android.widget.RadioButton
import android.widget.Toast

class OperasActivity : AppCompatActivity() {

    private lateinit var edt1: EditText
    private lateinit var edt2: EditText
    private lateinit var btn1: Button
    private lateinit var tv1: TextView
    private lateinit var rgOperaciones: RadioGroup
    private lateinit var rbSumar: RadioButton
    private lateinit var rbRestar: RadioButton
    private lateinit var rbMultiplicar: RadioButton
    private lateinit var rbDividir: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_operas)

        edt1 = findViewById(R.id.edt1)
        edt2 = findViewById(R.id.edt2)
        btn1 = findViewById(R.id.btn1)
        tv1 = findViewById(R.id.tv1)
        rgOperaciones = findViewById(R.id.rgOperaciones)
        rbSumar = findViewById(R.id.rbSumar)
        rbRestar = findViewById(R.id.rbRestar)
        rbMultiplicar = findViewById(R.id.rbMultiplicar)
        rbDividir = findViewById(R.id.rbDividir)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    // 👇 ESTA FUNCIÓN VA FUERA DEL onCreate()
    fun calcular(view: View) {
        if (edt1.text.isEmpty() || edt2.text.isEmpty()) {
            Toast.makeText(this, "Ingrese ambos números", Toast.LENGTH_SHORT).show()
            return
        }

        val num1 = edt1.text.toString().toDouble()
        val num2 = edt2.text.toString().toDouble()
        var resultado = 0.0
        var operacion = ""

        when (rgOperaciones.checkedRadioButtonId) {
            R.id.rbSumar -> {
                resultado = num1 + num2
                operacion = "Suma"
            }
            R.id.rbRestar -> {
                resultado = num1 - num2
                operacion = "Resta"
            }
            R.id.rbMultiplicar -> {
                resultado = num1 * num2
                operacion = "Multiplicación"
            }
            R.id.rbDividir -> {
                if (num2 == 0.0) {
                    Toast.makeText(this, "No se puede dividir por cero", Toast.LENGTH_SHORT).show()
                    return
                }
                resultado = num1 / num2
                operacion = "División"
            }
        }

        val resultadoFormateado = if (resultado % 1 == 0.0) {
            resultado.toInt().toString()
        } else {
            String.format("%.2f", resultado)
        }

        tv1.text = "Resultado ($operacion): $resultadoFormateado"
    }
}


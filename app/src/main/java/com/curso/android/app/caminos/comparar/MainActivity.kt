package com.curso.android.app.caminos.comparar

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {
    private lateinit var text1: EditText
    private lateinit var text2: EditText
    private lateinit var btncomparar: Button
    private lateinit var btnlimpiar: Button
    private lateinit var txtcomparar: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        text1 = findViewById(R.id.txt1)
        text2 = findViewById(R.id.txt2)
        btncomparar = findViewById(R.id.btncomparar)
        txtcomparar = findViewById(R.id.txtcomparar)
        btnlimpiar = findViewById(R.id.btnlimpiar)


        btncomparar.setOnClickListener {
            comparar()
        }

        btnlimpiar.setOnClickListener {
            limpiar()
        }

    }

    private fun comparar() {
            val texto1: String = text1.text.toString().trim().lowercase()
            val texto2: String = text2.text.toString().trim().lowercase()

           val resultado = if (texto1 == texto2) {
                "Los textos son iguales."
            } else {
                "Los textos son distintos."
            }
        txtcomparar.text = resultado
        }
    private fun limpiar() {
            text1.text.clear()
            text2.text.clear()
            txtcomparar.text = ""
            text1.requestFocus()
        }
}


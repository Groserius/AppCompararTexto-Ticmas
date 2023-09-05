package com.curso.android.app.caminos.comparar

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider


class MainActivity : AppCompatActivity() {
    lateinit var text1: EditText
    lateinit var text2: EditText
    lateinit var btncomparar: Button
    lateinit var btnlimpiar: Button
    lateinit var txtcomparar: TextView
    lateinit var viewModel: TextViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        text1 = findViewById(R.id.txt1)
        text2 = findViewById(R.id.txt2)
        btncomparar = findViewById(R.id.btncomparar)
        txtcomparar = findViewById(R.id.txtcomparar)
        btnlimpiar = findViewById(R.id.btnlimpiar)
        viewModel = ViewModelProvider(this)[TextViewModel::class.java]

        btncomparar.setOnClickListener {
                val text1 = text1.text.toString().trim().lowercase()
                val text2 = text2.text.toString().trim().lowercase()
                val resultado = viewModel.comparar(text1, text2)
                txtcomparar.text = resultado
            }

        btnlimpiar.setOnClickListener {
            limpiar()
        }

    }

    private fun limpiar() {
            text1.text.clear()
            text2.text.clear()
            txtcomparar.text = ""
            text1.requestFocus()
        }

}


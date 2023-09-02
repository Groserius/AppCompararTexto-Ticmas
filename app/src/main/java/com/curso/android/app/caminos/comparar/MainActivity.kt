package com.curso.android.app.caminos.comparar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txt1 = findViewById<EditText>(R.id.txt1)
        val txt2 = findViewById<EditText>(R.id.txt2)
        val btncomparar = findViewById<Button>(R.id.btncomparar)
        val txtcomparar = findViewById<TextView>(R.id.txtcomparar)



        btncomparar.setOnClickListener {

            val texto1:String = txt1.text.toString().lowercase()
            val texto2:String = txt2.text.toString().lowercase()

            if (texto1 == texto2) {
                txtcomparar.text = "Los textos son  iguales."
            } else {
                txtcomparar.text = "Los textos son diferentes."
            }
        }
    }
    private fun comparar(texto1: String, texto2: String): Boolean {
        return texto1.equals(texto2, ignoreCase = true)
    }
}

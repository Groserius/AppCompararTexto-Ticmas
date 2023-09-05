package com.curso.android.app.caminos.comparar

import androidx.lifecycle.ViewModel

class TextViewModel : ViewModel() {
    fun comparar(texto1: String, texto2: String): String {
        val text1 = texto1.trim().lowercase()
        val text2 = texto2.trim().lowercase()

        return if (text1 == text2) {
            "Los textos son iguales."
        } else {
            "Los textos son diferentes."
        }
    }
}

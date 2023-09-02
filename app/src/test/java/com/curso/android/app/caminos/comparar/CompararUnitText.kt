package com.curso.android.app.caminos.comparar


import org.junit.Assert
import org.junit.Test

class CompararUnitText {
    
    fun comparar(texto1: String, texto2: String): Boolean {
        return texto1.equals(texto2, ignoreCase = true)

    }
        @Test
        fun testCompararTexto() {

            val result1 = comparar("hola", "hola")
            Assert.assertTrue(result1)


            val result2 = comparar("hola", "adiós")
            Assert.assertFalse(result2)

        }

}

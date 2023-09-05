package com.curso.android.app.caminos.comparar


import org.junit.Test
import org.junit.Assert.*

class CompararUnitText {

    @Test
    fun testTextosIguales() {
        val txtviewmodel: TextViewModel = TextViewModel()

        val resultado = txtviewmodel.comparar("   Hola Mundo  ", "hola mundo")

        assertEquals("Los textos son iguales.", resultado)
    }

    @Test
    fun testComparar_TextosDiferentes() {
        val txtviewmodel: TextViewModel = TextViewModel()

        val resultado = txtviewmodel.comparar("Android", "iOS")

        assertEquals("Los textos son diferentes.", resultado)
    }

    @Test
    fun testComparar_TextosConEspacios() {
        val txtviewmodel: TextViewModel = TextViewModel()

        val resultado = txtviewmodel.comparar("   Espacio  ", "espacio")

        assertEquals("Los textos son iguales.", resultado)
    }
}
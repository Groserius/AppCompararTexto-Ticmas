package com.curso.android.app.caminos.comparar


import org.junit.Test
import org.junit.Assert.*

class CompararUnitText {

    @Test
    fun testEqualStrings() {
        val string1 = "Casa"
        val string2 = "casa"
        val result = comparar(string1.lowercase().replace(" ", ""),
            string2.lowercase().replace(" ", ""))
        assertEquals(true, result)
    }
    @Test
    fun testDifferentStrings() {
        val string1 = "Casa"
        val string2 = "auto"
        val result = comparar(string1.lowercase().replace(" ", ""),
            string2.lowercase().replace(" ", ""))
        assertEquals(false, result)
    }
    private fun comparar(string1: String, string2: String): Boolean {
        return string1 == string2
    }
}
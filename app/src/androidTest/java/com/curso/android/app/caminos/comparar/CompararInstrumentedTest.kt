package com.curso.android.app.caminos.comparar

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest

import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class CompararInstrumentedTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testCompleteAppInteraction() {
        val txt1 = "Hola"
        val txt2 = "hola"


        onView(withId(R.id.txt1)).perform(typeText(txt1), closeSoftKeyboard())
        onView(withId(R.id.txt2)).perform(typeText(txt2), closeSoftKeyboard())


        onView(withId(R.id.btncomparar)).perform(click())


        onView(withId(R.id.txtcomparar)).check(matches(withText("Los textos son iguales.")))
    }
}

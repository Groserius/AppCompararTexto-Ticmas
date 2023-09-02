package com.curso.android.app.caminos.comparar

import androidx.test.espresso.Espresso.onView
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
    fun testElementosUI() {
        onView(withId(R.id.txt1)).check(matches(isDisplayed()))
        onView(withId(R.id.txt2)).check(matches(isDisplayed()))
        onView(withId(R.id.btncomparar)).check(matches(isDisplayed()))
        onView(withId(R.id.txtcomparar)).check(matches(isDisplayed()))
    }
}
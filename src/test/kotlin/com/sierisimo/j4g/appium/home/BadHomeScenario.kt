package com.sierisimo.j4g.appium.home

import com.sierisimo.j4g.appium.AndroidScenario
import io.appium.java_client.android.AndroidElement
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class BadHomeScenario : AndroidScenario() {
    @Test
    fun `test empty Home launches`() {
        val noItemsTextView: AndroidElement =
                driver.findElementById("com.ut.anaelizondo.inventarios:id/tvMainNoItemsSad")

        assertNotNull(noItemsTextView)
        assertTrue(noItemsTextView.isDisplayed)
        assertEquals(":(", noItemsTextView.text)
    }
}
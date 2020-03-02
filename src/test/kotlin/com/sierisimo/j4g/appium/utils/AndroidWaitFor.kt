package com.sierisimo.j4g.appium.utils

import io.appium.java_client.android.AndroidElement
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait

interface AndroidWaitFor {
    fun AndroidElement.waitForClickable(timeout: Long = 30): AndroidElement {
        val wait = WebDriverWait(wrappedDriver, timeout)
        wait.until(ExpectedConditions.elementToBeClickable(this))

        return this
    }

    fun AndroidElement.waitForText(text: String, timeout: Long = 30) {
        val wait = WebDriverWait(wrappedDriver, timeout)
        wait.until(ExpectedConditions.textToBePresentInElement(this, text))
    }
}
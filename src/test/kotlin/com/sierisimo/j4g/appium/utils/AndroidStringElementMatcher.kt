package com.sierisimo.j4g.appium.utils

import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.AndroidElement
import org.openqa.selenium.By
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait

interface AndroidStringElementMatcher {
    fun String.asId(packageName: String): String {
        val idWord = "id"
        return "$packageName:$idWord/$this"
    }

    fun String.asElement(driver: AndroidDriver<AndroidElement>, packageName: String): AndroidElement {
        return driver.findElementById(this.asId(packageName))
    }

    fun String.waitForTextToBe(driver: AndroidDriver<AndroidElement>, timeout: Long = 20, text: String) {
        val waitDriver = WebDriverWait(driver, timeout)
        waitDriver.until(ExpectedConditions.textMatches(By.id(this.asId("")), text.toPattern()))
    }
}
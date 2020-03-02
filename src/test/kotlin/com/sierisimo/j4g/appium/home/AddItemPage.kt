package com.sierisimo.j4g.appium.home

import com.sierisimo.j4g.appium.utils.AndroidStringElementMatcher
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.AndroidElement

class AddItemPage(
        driver: AndroidDriver<AndroidElement>,
        appId: String
) : AndroidStringElementMatcher {
    val toolbar = "mtAdd".asElement(driver, appId)
    val toolbarUpButton = toolbar.findElementByClassName("android.widget.ImageButton") as AndroidElement
}
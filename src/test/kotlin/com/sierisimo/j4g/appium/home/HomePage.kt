package com.sierisimo.j4g.appium.home

import com.sierisimo.j4g.appium.utils.AndroidStringElementMatcher
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.AndroidElement
import io.appium.java_client.pagefactory.AndroidBy
import io.appium.java_client.pagefactory.iOSBy

class HomePage(
        driver: AndroidDriver<AndroidElement>,
        appId: String
) : AndroidStringElementMatcher {
    val emptyText = "tvMainNoItemsSad".asElement(driver, appId)
    val emptyMessageText = "tvMainNoItems".asElement(driver, appId)

    @iOSBy()
    val addButton = "agregar_item".asElement(driver, appId)
}
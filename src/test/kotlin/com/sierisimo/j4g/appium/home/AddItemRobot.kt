package com.sierisimo.j4g.appium.home

import com.sierisimo.j4g.appium.utils.AndroidWaitFor
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.AndroidElement

class AddItemRobot(driver: AndroidDriver<AndroidElement>, appId: String) : AndroidWaitFor {
    private val addItemPage = AddItemPage(driver, appId)

    fun clickToolbarUp() {
        addItemPage.toolbarUpButton.waitForClickable().click()
    }
}
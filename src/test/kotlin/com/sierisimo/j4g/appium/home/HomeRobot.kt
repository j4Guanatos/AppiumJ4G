package com.sierisimo.j4g.appium.home

import com.sierisimo.j4g.appium.utils.AndroidWaitFor
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.AndroidElement

class HomeRobot(driver: AndroidDriver<AndroidElement>, appId: String) : AndroidWaitFor {
    private val homePage: HomePage = HomePage(driver, appId)

    val isEmptyTextDisplayed: Boolean
        get() = homePage.emptyText.isDisplayed

    val isEmptyMessageDisplayed: Boolean
        get() = homePage.emptyMessageText.isDisplayed

    fun clickOnAdd(): HomeRobot {
        homePage.addButton.waitForClickable().click()

        return this
    }
}
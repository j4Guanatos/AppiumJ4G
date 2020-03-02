package com.sierisimo.j4g.appium.home

import com.sierisimo.j4g.appium.AndroidScenario
import org.junit.Test
import kotlin.test.assertTrue

class AddItemsScenario : AndroidScenario() {
    private val homeRobot = HomeRobot(driver, appId)
    private val addItemRobot = AddItemRobot(driver, appId)

    @Test
    fun `adding an item but presing back makes empty content is still visible`() {
        assertTrue(homeRobot.isEmptyTextDisplayed, "Sad face should be visible when empty")
        assertTrue(homeRobot.isEmptyMessageDisplayed, "Empty message is shown")

        homeRobot.clickOnAdd()
        addItemRobot.clickToolbarUp()

        assertTrue(homeRobot.isEmptyTextDisplayed, "Sad face should be visible when empty")
        assertTrue(homeRobot.isEmptyMessageDisplayed, "Empty message is shown")
    }
}
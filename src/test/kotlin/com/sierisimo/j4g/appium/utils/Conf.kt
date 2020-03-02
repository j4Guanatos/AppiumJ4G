package com.sierisimo.j4g.appium.utils

import com.sierisimo.j4g.appium.AndroidScenario
import java.io.IOException
import java.lang.Integer.parseInt
import java.util.*

fun appiumConfiguration(): AppiumConf {
    val properties = Properties()

    try {
        val configs = AndroidScenario::class.java.classLoader.getResource("appium.properties")?.openStream()
        properties.load(configs)
    } catch (ioEx: IOException) {
        ioEx.printStackTrace()
    }

    return AppiumConf(
            properties["platform"]?.toString() ?: "Android",
            properties["device.name"]?.toString() ?: "Android Emulator",
            properties["app.android.package"]?.toString() ?: "",
            properties["app.android.activity"]?.toString() ?: "",
            properties["appium.host"]?.toString() ?: "",
            parseInt(properties["appium.port"]?.toString() ?: ""),
            properties["appium.hub"]?.toString() ?: ""
    )
}
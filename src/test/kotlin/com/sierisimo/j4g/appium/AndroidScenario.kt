package com.sierisimo.j4g.appium

import com.sierisimo.j4g.appium.utils.appiumConfiguration
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.AndroidElement
import io.appium.java_client.remote.AndroidMobileCapabilityType
import io.appium.java_client.remote.MobileCapabilityType
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS
import org.openqa.selenium.remote.DesiredCapabilities
import java.util.concurrent.TimeUnit

@TestInstance(PER_CLASS)
open class AndroidScenario {
    protected val driver: AndroidDriver<AndroidElement>

    private val conf = appiumConfiguration()

    val appId: String
        get() = conf.appId

    init {
        val capabilities = DesiredCapabilities().apply {
            //setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2")

            setCapability(MobileCapabilityType.PLATFORM_NAME, conf.platform)
            setCapability(MobileCapabilityType.DEVICE_NAME, conf.device)

            //setCapability(MobileCapabilityType.APP, appFile.absolutePath)
            setCapability(AndroidMobileCapabilityType.APP_PACKAGE, conf.appId)
            setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, conf.launchScreen)
            setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, "true")
        }

        driver = AndroidDriver(conf.hub, capabilities)
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS)
    }

    @AfterAll
    fun tearDown() {
        driver.quit()
    }
}
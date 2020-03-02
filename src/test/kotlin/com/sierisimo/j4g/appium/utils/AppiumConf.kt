package com.sierisimo.j4g.appium.utils

import java.net.URL

data class AppiumConf(
        val platform: String,
        val device: String,
        val appId: String,
        val launchScreen: String,
        private val host: String,
        private val port: Int,
        private val hubEndpoint: String
) {
    val hub: URL by lazy { URL("http://$host:$port$hubEndpoint") }
}
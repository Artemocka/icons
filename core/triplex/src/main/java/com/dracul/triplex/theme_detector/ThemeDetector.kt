package com.dracul.triplex.theme_detector

import android.content.Context
import android.os.Build

object ThemeDetector {

    private var appContext: Context? = null

    internal fun init(context: Context) {
        appContext = context
    }

    val isDarkTheme: Boolean
        get() {
            val ctx = appContext ?: return false
            return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) ctx.resources.configuration.isNightModeActive else false
        }
}
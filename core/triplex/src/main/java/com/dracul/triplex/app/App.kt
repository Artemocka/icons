package com.dracul.triplex.app

import android.app.Application
import com.dracul.triplex.theme_detector.ThemeDetector

class App : Application(){
    override fun onCreate() {
        super.onCreate()
        ThemeDetector.init(applicationContext)
    }
}
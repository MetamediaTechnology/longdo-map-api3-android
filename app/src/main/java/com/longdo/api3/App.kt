package com.longdo.api3

import android.app.Application
import android.webkit.WebView

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        WebView.setWebContentsDebuggingEnabled(BuildConfig.DEBUG)
    }

}
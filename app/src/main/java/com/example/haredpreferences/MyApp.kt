package com.example.haredpreferences

import android.app.Application

val preferences:SharedPreferences by lazy { MyApp.prefs!!  }

class MyApp: Application() {
companion object{
    var prefs:SharedPreferences?=null

}

    override fun onCreate() {
        super.onCreate()
        prefs= SharedPreferences(applicationContext)

    }
}
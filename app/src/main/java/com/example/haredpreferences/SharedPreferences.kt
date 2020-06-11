package com.example.haredpreferences

import android.content.Context

class SharedPreferences (context:Context){
    private  val filename="mis_preferencias"
    //instacia de ese fichero
    private val preferf=context.getSharedPreferences(filename,Context.MODE_PRIVATE)
    //por cada una de nuestras variables vamos a guardar en nuestro ficheros
    var name: String
        get() = preferf.getString("name","").toString()
        set(value) = preferf.edit().putString("name",value).apply()


    var age: Int
        get() = preferf.getInt("age",-1)
        set(value) = preferf.edit().putInt("age",value).apply()


}
package com.example.haredpreferences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

    private fun SetvalueSharedPreferences() {

        if (preferences.name.toString().isNotEmpty() && preferences.age >-1){
            editTextTextPersonName.setText("welcome your name is ${preferences.name }")
            editTextNumber.setText("welcome your age is ${preferences.age }")


        }else{
            Toast.makeText(this,"non ci sono dati ",Toast.LENGTH_LONG).show()

        }

    }

    private fun GetValueSharedPreferences() {
        if (editTextTextPersonName.toString().isNotEmpty() && editTextNumber.toString().isNotEmpty()){
            preferences.name=editTextTextPersonName.toString()
            preferences.age=editTextNumber.toString().toInt()
            Toast.makeText(this,"dati salvat",Toast.LENGTH_LONG).show()

        }else{
            Toast.makeText(this,"inserire dati da salvare",Toast.LENGTH_LONG).show()

        }

    }

    fun onclick(view: View) {
        when(view.id){
            R.id.button2->{
                CleanData()
            }
            R.id.buttonSett->{
                GetValueSharedPreferences();SetvalueSharedPreferences()
            }

        }

    }

    private fun CleanData() {
        editTextNumber.setText("")
        editTextTextPersonName.setText("")
    }
}
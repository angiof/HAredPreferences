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

        buttonSett.setOnClickListener {
            SetvalueSharedPreferences()
            CleanData()
            GetValueSharedPreferences()
        }
        GetValueSharedPreferences()

    }
    private fun GetValueSharedPreferences()
    {
        if (preferences.name.toString().isNotEmpty() && preferences.age >0){

            Toast.makeText(this,"${preferences.name}",Toast.LENGTH_LONG).show()

            textViewSharedPreferences.setText("${preferences.name} , ${preferences.age} ")

            Toast.makeText(this,"dati salvat",Toast.LENGTH_LONG).show()

        }else{
            Toast.makeText(this,"inserire dati da salvare",Toast.LENGTH_LONG).show()

        }

    }
    private fun SetvalueSharedPreferences() {

        if (editTextTextPersonName.text.toString().isNotEmpty() && editTextNumber.text.toString().isNotEmpty()){
            preferences.name =editTextTextPersonName.text.toString()
            preferences.age = editTextNumber.getText().toString().toInt()


        }else{
            textViewSharedPreferences.setText("non ci sono dati ")
        }
    }
    private fun CleanData() {

        editTextNumber.text.clear()
        editTextTextPersonName.text.clear()
    }
}
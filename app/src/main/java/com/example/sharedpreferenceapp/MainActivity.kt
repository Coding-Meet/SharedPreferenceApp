package com.example.sharedpreferenceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edName = findViewById<EditText>(R.id.edName)
        val edAge = findViewById<EditText>(R.id.edAge)
        val btnGet = findViewById<Button>(R.id.btnGet)
        val btnSet = findViewById<Button>(R.id.btnSet)
        val btnClear = findViewById<Button>(R.id.btnClear)


        btnClear.setOnClickListener {
            edName.text = null
            edAge.text = null
        }
        val sharedPreferenceManger = SharedPreferenceManger(this)
        btnGet.setOnClickListener {
            edName.setText(sharedPreferenceManger.name)
            edAge.setText(sharedPreferenceManger.age.toString())
        }


        btnSet.setOnClickListener {
            sharedPreferenceManger.name = edName.text.toString()
            sharedPreferenceManger.age = edAge.text.toString().toInt()
        }
    }
}
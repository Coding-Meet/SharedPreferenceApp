package com.example.sharedpreferenceapp

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity

class SharedPreferenceManger(context: Context) {
    private val preference: SharedPreferences = context.getSharedPreferences(
        context.getString(R.string.app_name),
        AppCompatActivity.MODE_PRIVATE
    )
    private val editor: SharedPreferences.Editor = preference.edit()


    private val keyName = "name"
    private val keyAge = "age"


    var name
        get() = preference.getString(keyName, "").toString()
        set(value) {
            editor.putString(keyName, value)
            editor.commit()
        }

    var age
        get() = preference.getInt(keyAge, 0)
        set(value) {
            editor.putInt(keyAge, value)
            editor.commit()
        }

}
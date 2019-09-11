package com.example.itesogram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ActivityLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()


    }

    fun mRegister(view: View) {
        val intent = Intent(this, ActivityRegister::class.java)
        intent.putExtra("SHOW_WLCOME", true)
        startActivity(intent)
    }

    fun mLogin(view: View) {
        val intent = Intent(this, ActivitySaveInParse::class.java)
        intent.putExtra("SHOW_WLCOME", true)
        startActivity(intent)
    }
}

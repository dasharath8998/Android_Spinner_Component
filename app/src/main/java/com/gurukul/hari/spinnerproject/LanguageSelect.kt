package com.gurukul.hari.spinnerproject

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_language_select.*

class LanguageSelect : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_language_select)

        btnEng.setOnClickListener{
            val i = Intent(this@LanguageSelect,MainActivity::class.java)
            startActivity(i)
        }

        btnHindi.setOnClickListener{
            val i = Intent(this@LanguageSelect,MainActivity::class.java)
            startActivity(i)
        }
    }
}

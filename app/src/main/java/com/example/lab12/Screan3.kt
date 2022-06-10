package com.example.lab12

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Screan3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screan3)
    }
    fun onClickStepsActivity(view: View){
        val intent = Intent(this, Screan2::class.java)
        startActivity(intent)
    }
}
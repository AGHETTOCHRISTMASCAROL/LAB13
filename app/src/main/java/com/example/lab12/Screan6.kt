package com.example.lab12

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Screan6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screan6)
    }
    fun onClickStepsActivity(view: View){
        val intent = Intent(this, Screan5::class.java)
        startActivity(intent)
    }
}
package com.example.lab12

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Screan5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screan5)
    }
    fun onClickStepsActivity(view: View){
        val intent = Intent(this, Screan4::class.java)
        startActivity(intent)
    }
    fun onClickStepsActivity2(view: View){
        val intent = Intent(this, Screan6::class.java)
        startActivity(intent)
    }
    fun onClickStepsActivity3(view: View){
        val intent = Intent(this, Screan7::class.java)
        startActivity(intent)
    }
}
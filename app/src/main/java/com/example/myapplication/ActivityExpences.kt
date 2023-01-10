package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myapplication.databinding.ActivityExpencesBinding
import com.example.myapplication.databinding.ActivityMainBinding

class ActivityExpences : AppCompatActivity() {

    lateinit var bindingClass: ActivityExpencesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityExpencesBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

    }

    fun onClickExpencesButon(view : View){
        val testid = view.toString()
        bindingClass.textExpenses11.text = "test"

    }




}
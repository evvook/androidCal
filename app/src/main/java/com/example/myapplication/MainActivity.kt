package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val screen = Screen(findViewById<TextView>(R.id.screen))
        val expression = Expression(screen)

        val one = NumberButton(findViewById<Button>(R.id.num1), expression)
        val two = NumberButton(findViewById<Button>(R.id.num2), expression)

        val plus = OperatorButton(findViewById<Button>(R.id.oprPlus), expression)
    }
}
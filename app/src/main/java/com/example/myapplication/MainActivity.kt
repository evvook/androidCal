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

        val zero = NumberButton(findViewById<Button>(R.id.num0), expression)
        val one = NumberButton(findViewById<Button>(R.id.num1), expression)
        val two = NumberButton(findViewById<Button>(R.id.num2), expression)
        val three = NumberButton(findViewById<Button>(R.id.num3), expression)
        val four = NumberButton(findViewById<Button>(R.id.num4), expression)
        val five = NumberButton(findViewById<Button>(R.id.num5), expression)
        val six = NumberButton(findViewById<Button>(R.id.num6), expression)
        val seven = NumberButton(findViewById<Button>(R.id.num7), expression)
        val eight = NumberButton(findViewById<Button>(R.id.num8), expression)
        val nine = NumberButton(findViewById<Button>(R.id.num9), expression)

        val plus = OperatorButton(findViewById<Button>(R.id.oprPlus), expression, Plus())
        val minus = OperatorButton(findViewById<Button>(R.id.oprMinus), expression, Minus())
        val multi = OperatorButton(findViewById<Button>(R.id.oprMulti), expression, Multi())
        val divide = OperatorButton(findViewById<Button>(R.id.oprDivide), expression, Divide())

        val clear = FuncButton(findViewById<Button>(R.id.clear), expression, Clear())
        val cal = FuncButton(findViewById<Button>(R.id.cal), expression, Calculate())
        val dot = FuncButton(findViewById<Button>(R.id.dot), expression, Dot())
    }
}
package com.example.myapplication

import android.widget.Button

class Clear : CalFunc{
    override fun work(expression: Expression) {
        expression.clearOperand()
        expression.clearOperator()
        expression.print()
    }
}
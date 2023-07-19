package com.example.myapplication

import android.widget.Button

class OperatorButton {
    constructor(btn: Button, expression:Expression, operator:Operator){
        this.operator = operator

        btn.setOnClickListener {
            expression.setOperator(this.operator)
        }
    }
    private val operator:Operator
}
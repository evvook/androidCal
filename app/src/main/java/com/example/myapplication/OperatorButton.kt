package com.example.myapplication

import android.widget.Button

class OperatorButton {
    constructor(btn: Button, expression:Expression){
        btn.setOnClickListener {
            expression.setOperator(btn.text)
        }
    }
}
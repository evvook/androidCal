package com.example.myapplication

import android.widget.Button

class NumberButton {
    constructor(btn:Button, expression:Expression){
        btn.setOnClickListener {
            expression.makeOperand(btn.text)
        }
    }
}
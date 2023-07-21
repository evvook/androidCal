package com.example.myapplication

import android.widget.Button

class FuncButton {
    constructor(btn: Button, expression: Expression,calFunc: CalFunc){
        this.calFunc = calFunc

        btn.setOnClickListener {
            calFunc.work(expression)
        }
    }
    private val calFunc: CalFunc
}
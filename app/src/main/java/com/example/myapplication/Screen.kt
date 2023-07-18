package com.example.myapplication

import android.util.Log
import android.widget.TextView

class Screen {
    constructor(tView:TextView){
        this.tView = tView
    }
    private val tView :TextView

    fun printExpression(expression:String){
        tView.text = expression
    }
}
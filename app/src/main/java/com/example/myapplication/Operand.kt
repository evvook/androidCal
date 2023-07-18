package com.example.myapplication

class Operand {
    private var operand:String = ""
    fun makeOperand(text: String) {
        operand += text
    }

    fun print():String{
        return operand
    }

    fun setOperand(operand: String) {
        this.operand = operand
    }

    fun clear() {
        operand = ""
    }
}
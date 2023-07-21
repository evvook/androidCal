package com.example.myapplication

class Operand {
    private var operand:String = ""
    fun makeOperand(text: String) {
        if(operand == "0"){
            if(text == "0"){
                return
            }else if(text != "."){
                operand = text
                return
            }
        }
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
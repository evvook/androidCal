package com.example.myapplication

import java.math.BigDecimal

class Operator {
    private var operator:String = ""
    fun isEmpty(): Boolean {
        return "".equals(operator)
    }

    fun set(text: CharSequence) {
        operator = text.toString()
    }

    fun print():String{
        return operator
    }

    fun calculate(first: Operand, second: Operand) {
        val result = BigDecimal(first.print()).plus(BigDecimal(second.print()))
        first.setOperand(result.toString())
        second.clear()
        operator = ""
    }
}
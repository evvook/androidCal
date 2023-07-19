package com.example.myapplication

import java.math.BigDecimal

interface Operator {
    val operator:String

    fun print():String{
        return operator
    }

    fun calculate(first: Operand, second: Operand)
}
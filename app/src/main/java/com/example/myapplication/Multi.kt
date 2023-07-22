package com.example.myapplication

import java.math.BigDecimal

class Multi : Operator {

    override val operator: String="×"

    override fun calculate(first: Operand, second: Operand){
        val result = BigDecimal(first.print()).multiply(BigDecimal(second.print()))
        first.setOperand(result.toString())
        second.clear()
    }
}
package com.example.myapplication

import java.math.BigDecimal
import java.math.RoundingMode

class Divide : Operator {

    override val operator: String="÷"

    override fun calculate(first: Operand, second: Operand){
        val result = BigDecimal(first.print()).divide(BigDecimal(second.print()),10,RoundingMode.CEILING)
        first.setOperand(result.toString())
        second.clear()
    }
}
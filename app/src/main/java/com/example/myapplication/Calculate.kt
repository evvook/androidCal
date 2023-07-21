package com.example.myapplication

class Calculate: CalFunc {
    override fun work(expression: Expression) {
        expression.calculate()
        expression.clearOperator()
        expression.print()
    }
}
package com.example.myapplication

class Dot:CalFunc {
    override fun work(expression: Expression) {
        val operand:Operand = expression.getCurrentOperand()
        if(operand.print() == ""){
            operand.setOperand("0.")
        }else{
            if(operand.print().contains(".")){
                return
            }else{
                operand.makeOperand(".")
            }
        }
        expression.print()
    }
}
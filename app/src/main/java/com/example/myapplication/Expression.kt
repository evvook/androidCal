package com.example.myapplication

import android.util.Log

class Expression {
    constructor(screen:Screen){
        this.screen = screen
    }
    private val first:Operand = Operand()
    private val second:Operand = Operand()
    private val operator:Operator = Operator()

    private val screen:Screen

    fun makeOperand(text:CharSequence){
        if(operator.isEmpty()){
            first.makeOperand(text.toString())
        }else{
            second.makeOperand(text.toString())
        }
        printExpression()
    }

    fun setOperator(text:CharSequence){
        if(operator.isEmpty()){
            operator.set(text)
        }else {
            operator.calculate(first,second)
            operator.set(text)
        }
        printExpression()
    }

    private fun printExpression(){
        screen.printExpression(first.print()+operator.print()+second.print())
    }
}
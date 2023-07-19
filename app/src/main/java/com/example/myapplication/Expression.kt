package com.example.myapplication

import android.util.Log

class Expression {
    constructor(screen:Screen){
        this.screen = screen
    }
    private val first:Operand = Operand()
    private val second:Operand = Operand()
    private var operator: Operator? = null

    private val screen:Screen

    fun makeOperand(text:CharSequence){
        if(operator == null){
            first.makeOperand(text.toString())
        }else{
            second.makeOperand(text.toString())
        }
        printExpression()
    }

    fun setOperator(operator: Operator){
        if(this.operator == null){
            this.operator = operator
        }else {
            this.operator!!.calculate(first,second)
            this.operator = operator
        }
        printExpression()
    }

    private fun printExpression(){
        var operator = ""
        if(this.operator!=null){
            operator = this.operator!!.print()
        }
        screen.printExpression(first.print()+operator+second.print())
    }
}
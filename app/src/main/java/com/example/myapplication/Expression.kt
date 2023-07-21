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

    private var beCalculated = false

    fun makeOperand(text:CharSequence){

        if (operator == null) {
            if(beCalculated){
                first.setOperand(text.toString())
                beCalculated = false
            }else {
                first.makeOperand(text.toString())
            }
        } else {
            second.makeOperand(text.toString())
        }
        print()
    }

    fun setOperator(operator: Operator){
        if(this.operator == null){
            this.operator = operator
        }else {
            calculate()
            this.operator = operator
        }
        print()
    }

    fun print(){
        var operator = ""
        if(this.operator!=null){
            operator = this.operator!!.print()
        }
        screen.printExpression(first.print()+operator+second.print())
    }

    fun clearOperand() {
        first.clear()
        second.clear()
        beCalculated = false
    }

    fun clearOperator() {
        operator = null
    }

    fun calculate() {
        if(operator == null){
            return
        }
        if(first.print() == ""){
            first.setOperand("0")
        }
        if(second.print() == ""){
            second.setOperand("0")
        }
        this.operator!!.calculate(first,second)
        beCalculated = true
    }

    fun getCurrentOperand(): Operand {
        return if(operator == null){
            first
        }else{
            second
        }
    }
}
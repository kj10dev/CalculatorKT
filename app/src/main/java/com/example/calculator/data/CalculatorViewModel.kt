package com.example.calculator.data

import androidx.lifecycle.ViewModel

class CalculatorViewModel: ViewModel() {

    var answer = ""

    fun addition(firstNumber: Int, secondNumber: Int) : Int {

        return firstNumber + secondNumber

    }

    fun subtraction(firstNumber: Int, secondNumber: Int) : Int {

        return firstNumber - secondNumber

    }

    fun multiplication(firstNumber: Int, secondNumber: Int) : Int {

        return firstNumber * secondNumber

    }

    fun division(firstNumber: Int, secondNumber: Int) : Float {

        return (firstNumber / secondNumber).toFloat()

    }

}
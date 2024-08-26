package com.vu.myapplication

abstract class Transaction(val name: String, private val value: Double) {

    abstract fun getValue(): Double
}

class Income(val income: String, private val value: Double): Transaction(income, value) {
    override fun getValue(): Double {
        return value
    }
}

class Expense(val income: String, private val value: Double): Transaction(income, value) {
    override fun getValue(): Double {
        return value.times(-1f)
    }
}
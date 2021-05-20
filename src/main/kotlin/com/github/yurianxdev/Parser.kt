package com.github.yurianxdev

class Parser {
    val terms = mutableListOf<Map<Char, Int>>()

    fun parse(expr: String) {
        terms.clear()
        val term = mutableMapOf<Char, Int>()

        var i = 0
        while (i < expr.length) {
            if (expr[i].isLetter()) {
                term[expr[i]] = if (i < expr.length - 1 && expr[i + 1] == '\'') 0 else 1
            }
            if (expr[i] == '+' || i == expr.length - 1) {
                val copy = hashMapOf<Char, Int>().apply { putAll(term) }
                terms.add(copy)
                term.clear()
            }
            i++
        }
    }
}

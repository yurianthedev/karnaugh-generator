package com.github.yurianxdev

import de.vandermeer.asciitable.AsciiTable

fun main() {
    print("Please enter an expression (e.g. AB'+BC): ")
    val exprInput = readLine() ?: throw IllegalArgumentException("Please provide a valid expression")

    val result = listOf(mutableListOf(0, 0, 0, 0), mutableListOf(0, 0, 0, 0))
    val terms = mutableListOf<Map<Char, Int>>()
    val term = mutableMapOf<Char, Int>()

    var i = 0
    while (i < exprInput.length) {
        if (exprInput[i].isLetter()) {
            term[exprInput[i]] = if (i < exprInput.length - 1 && exprInput[i + 1] == '\'') 0 else 1
        }
        if (exprInput[i] == '+' || i == exprInput.length - 1) {
            val copy = hashMapOf<Char, Int>().apply { putAll(term) }
            terms.add(copy)
            term.clear()
        }
        i++
    }

    val keys = listOf(Pair(0, 0), Pair(0, 1), Pair(1, 1), Pair(1, 0))
    for (expr in terms) {
        for (m in result.indices) {
            for (n in result[m].indices) {
                if ('A' in expr && keys[n].first != expr['A'] || 'B' in expr && keys[n].second != expr['B'] || 'C' in expr && m != expr['C'])
                    continue

                result[m][n] = 1
            }
        }
    }


    val at = AsciiTable()
    at.addRule()
    at.addRow("C\\AB", *keys.map { "${it.first}${it.second}" }.toTypedArray())
    for (m in result.indices) {
        at.addRule()
        at.addRow(m, *result[m].toTypedArray())
    }
    at.addRule()

    val table = at.render()
    print(table)
}

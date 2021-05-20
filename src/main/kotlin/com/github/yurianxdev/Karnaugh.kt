package com.github.yurianxdev

open class Karnaugh {
    protected val keys = listOf(Pair(0, 0), Pair(0, 1), Pair(1, 1), Pair(1, 0))
    val result = listOf(mutableListOf(0, 0, 0, 0), mutableListOf(0, 0, 0, 0))

    fun resolve(terms: List<Map<Char, Int>>) {
        result.forEach { it.map { 0 } }

        for (expr in terms) {
            for (m in result.indices) {
                for (n in result[m].indices) {
                    if ('A' in expr && keys[n].first != expr['A'] || 'B' in expr && keys[n].second != expr['B'] || 'C' in expr && m != expr['C'])
                        continue

                    result[m][n] = 1
                }
            }
        }
    }
}

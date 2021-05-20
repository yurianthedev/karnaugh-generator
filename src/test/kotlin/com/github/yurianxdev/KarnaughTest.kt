package com.github.yurianxdev

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class KarnaughTest {
    private val terms = listOf(mapOf('A' to 1, 'C' to 1), mapOf('A' to 1, 'B' to 0))

    @Test
    fun testResolve() {
        val k = Karnaugh()
        k.resolve(terms)
        assertEquals(k.result, listOf(listOf(0, 0, 0, 1), listOf(0, 0, 1, 1)))
    }
}
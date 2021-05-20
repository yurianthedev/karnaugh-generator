package com.github.yurianxdev

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

internal class ParserTest {
    private val expression = "AC+CB'";

    @Test
    fun testParse() {
        val parser = Parser()
        parser.parse(expression)
        assertContentEquals(parser.terms, listOf(mapOf('A' to 1, 'C' to 1), mapOf('C' to 1, 'B' to 0)))
    }
}
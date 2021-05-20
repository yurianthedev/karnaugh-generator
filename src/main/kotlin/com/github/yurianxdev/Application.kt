package com.github.yurianxdev

fun main() {
    print("Please enter an expression (e.g. AB'+BC): ")
    val exprInput = readLine() ?: throw IllegalArgumentException("Please provide a valid expression")

    val parser = Parser()
    parser.parse(exprInput)

    val kd = KarnaughDrawer()
    kd.resolve(parser.terms)
    println(kd.draw())
}

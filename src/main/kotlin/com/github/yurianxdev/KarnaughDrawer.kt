package com.github.yurianxdev

import de.vandermeer.asciitable.AsciiTable

class KarnaughDrawer : Karnaugh() {
    fun draw(): String {
        val at = AsciiTable()
        at.addRule()
        at.addRow("C\\AB", *keys.map { "${it.first}${it.second}" }.toTypedArray())
        for (m in result.indices) {
            at.addRule()
            at.addRow(m, *result[m].toTypedArray())
        }
        at.addRule()

        return at.render()
    }
}

package org.example

import java.util.ArrayList

fun generate(numRows: Int): List<List<Int>> {
    if(numRows == 1) return listOf(listOf(1))
    if(numRows == 2) return listOf(listOf(1), listOf(1, 1))
    val result = ArrayList<List<Int>>(numRows)

    for (index in 0..< numRows) {
        val newList = IntArray(index+1) { 1 }
        if(result.isNotEmpty()) {
            for(i in 0..< result.last().size-1) {
                newList[i+1] = result.last()[i] + result.last()[i+1]
            }
        }
        result.add(newList.toList())
    }

    return result
}
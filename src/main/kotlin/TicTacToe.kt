package org.example

import java.util.ArrayList
import kotlin.math.abs

fun tictactoe(moves: Array<IntArray>): String {
    val rows = arrayListOf(0, 0, 0)
    val cols = arrayListOf(0, 0, 0)
    var player = 1
    var d1 = 0
    var d2 = 0
    val n = 3
    moves.forEach { move ->
        val row = move.first()
        val col = move.last()

        rows[row] += player
        cols[col] += player

        if(row == col) {
            d1 += player
        }

        if(row + col == n-1) {
            d2 += player
        }


        if(abs(rows[row]) == n || abs(cols[col]) == n || abs(d1) == n || abs(d2) == n) {
            return if(player == 1) "A" else "B"
        }

        player *= -1
    }

    return if(moves.size == 9) "Draw" else "Pending"
}
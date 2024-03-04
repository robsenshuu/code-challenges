import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class TicTacToeKtTest {

    @Test
    fun tictactoe() {
        var input = arrayOf(
            intArrayOf(0,0),
            intArrayOf(2,0),
            intArrayOf(1,1),
            intArrayOf(2,1),
            intArrayOf(2,2),
        )

        var result = org.example.tictactoe(input)
        assertEquals(result, "A")

        input = arrayOf(
            intArrayOf(0,0),
            intArrayOf(1,1),
            intArrayOf(0,1),
            intArrayOf(0,2),
            intArrayOf(1,0),
            intArrayOf(2,0),
        )

        result = org.example.tictactoe(input)
        assertEquals(result, "B")

        input = arrayOf(
            intArrayOf(0,0),
            intArrayOf(1,1),
            intArrayOf(2,0),
            intArrayOf(1,0),
            intArrayOf(1,2),
            intArrayOf(2,1),
            intArrayOf(0, 1),
            intArrayOf(0, 2),
            intArrayOf(2, 2),
        )

        result = org.example.tictactoe(input)
        assertEquals(result, "Draw")

    }
}
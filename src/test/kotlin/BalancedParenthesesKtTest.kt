import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class BalancedParenthesesKtTest {
    @Test
    fun balancedParentheses() {
        var input = "()"
        assertEquals(org.example.balancedParentheses(input), true)

        input = "(hello, world)"
        assertEquals(org.example.balancedParentheses(input), true)

        input = "Random text (as this) is ok()."
        assertEquals(org.example.balancedParentheses(input), true)

        input = ")("
        assertEquals(org.example.balancedParentheses(input), false)

        input = "(Hello (,) world (!))"
        assertEquals(org.example.balancedParentheses(input), true)

        input = ")()("
        assertEquals(org.example.balancedParentheses(input), false)

        input = "())(()"
        assertEquals(org.example.balancedParentheses(input), false)
    }
}
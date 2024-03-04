import org.example.generate
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class PascalsTriangleKtTest {

    val test1 = listOf(
        listOf(1),
        listOf(1, 1),
        listOf(1,2,1),
        listOf(1,3,3,1),
        listOf(1,4,6,4,1)
    )
    @Test
    fun generate_test() {
        var result = generate(1)
        assertEquals(result, listOf(listOf(1)))

        result = generate(5)
        assertEquals(result, test1)
    }
}
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class AlphanumericSortKtTest {

    @Test
    fun `sort character starting with lower cases, upper cases, numbers (even then odd) and special characters`() {
        val result = org.example.alphanumericSort("4@DaCbe")
        assertEquals("abeDC4@", result)

        val result2 = org.example.alphanumericSort("4@5gU8\$qw")
        assertEquals("gqwU485@\$", result2)

        val result3 = org.example.alphanumericSort("8Sw2#9rA3D@q4e2")
        assertEquals("wrqeSAD824293#@", result3)
    }
}
package algorithms

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

class BasicRecursionKtTest {
    @Test
    fun `should return zero for empty list`() {
        val result = countNumberOfElements(emptyList())

        assertThat(result).isEqualTo(0)
    }

    @Test
    fun `should return 1 for list size of 1`() {
        val result = countNumberOfElements(listOf("element"))

        assertThat(result).isEqualTo(1)
    }

    @Test
    fun `should return 2 for list size of 2`() {
        val result = countNumberOfElements(listOf(8, 16))

        assertThat(result).isEqualTo(2)
    }
}
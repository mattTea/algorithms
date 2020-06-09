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

    @Test
    fun `should return element value in list of length 1`() {
        val result = findHighestNumber(listOf(4))

        assertThat(result).isEqualTo(4)
    }

    @Test
    fun `should return highest element value in list of length 2`() {
        val result = findHighestNumber(listOf(8, 4))

        assertThat(result).isEqualTo(8)
    }

    @Test
    fun `should return highest element value in list of length 4`() {
        val result = findHighestNumber(listOf(8, 12, 4, 12))

        assertThat(result).isEqualTo(12)
    }
}
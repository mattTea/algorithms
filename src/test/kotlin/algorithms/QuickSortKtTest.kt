package algorithms

import assertk.assertThat
import assertk.assertions.containsExactly
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

class QuickSortKtTest {
    @Test
    fun `should sort list of length 0`() {
        val result = quickSort(emptyList())

        assertThat(result).isEqualTo(emptyList())
    }

    @Test
    fun `should sort list of length 1`() {
        val result = quickSort(listOf(1))

        assertThat(result).containsExactly(1)
    }

    @Test
    fun `should sort list of length 2`() {
        val result = quickSort(listOf(8, 6))

        assertThat(result).containsExactly(6, 8)
    }

    @Test
    fun `should sort list of length 4`() {
        val result = quickSort(listOf(8, 6, 9, 1))

        assertThat(result).containsExactly(1, 6, 8, 9)
    }

    @Test
    fun `should sort list of length 8`() {
        val result = quickSort(listOf(8, 6, 9, 1, 12, 3, 5, 7))

        assertThat(result).containsExactly(1, 3, 5, 6, 7, 8, 9, 12)
    }

    @Test
    fun `should sort list that includes another number equal to the pivot`() {
        val result = quickSort(listOf(3, 6, 3, 8))

        assertThat(result).isEqualTo(listOf(3, 3, 6, 8))
    }
}
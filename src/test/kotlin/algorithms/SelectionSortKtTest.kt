package algorithms

import assertk.assertThat
import assertk.assertions.containsExactly
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

class SelectionSortKtTest {
    @Test
    fun `should return index of smallest int in list`() {
        val myList = listOf(5, 2, 6)
        val result = findIndexOfSmallestElement(myList)

        assertThat(result).isEqualTo(1)
    }

    @Test
    fun `should return sorted list`() {
        val myList = mutableListOf(5, 2, 6, 1)
        val result = selectionSort(myList)

        assertThat(result).containsExactly(1, 2, 5, 6)
    }
}
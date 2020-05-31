package algorithms

import assertk.assertThat
import assertk.assertions.isEqualTo
import assertk.assertions.isLessThanOrEqualTo
import assertk.assertions.isNull
import org.junit.jupiter.api.Test

class BinarySearchKtTest {
    @Test
    fun `should return item index for list of length 3`() {
        val myList = listOf(1, 3, 5)
        val result = binarySearch(myList, 5)

        assertThat(result.second).isEqualTo(2)
    }

    @Test
    fun `should return item index for list of length 5`() {
        val myList = listOf(1, 3, 5, 7, 9)
        val result = binarySearch(myList, 7)

        assertThat(result.second).isEqualTo(3)
    }

    @Test
    fun `should make max 4 guesses to reach last item in list of length 8`() {
        val myList = listOf(1, 2, 3, 4, 5, 6, 7, 8)
        val result = binarySearch(myList, 8)

        assertThat(result.first).isEqualTo(4)
        // mid is always rounded down, so need the extra fourth guess (log 8 = 3 needs 4 guesses)
    }

    @Test
    fun `should make max 4 guesses to reach any item in list of length 8`() {
        val myList = listOf(1, 2, 3, 4, 5, 6, 7, 8)
        val randomResult = binarySearch(myList, myList.indices.random())

        assertThat(randomResult.first).isLessThanOrEqualTo(4)
    }

    @Test
    fun `should return null for item not in list`() {
        val myList = listOf(1, 2, 3)
        val result = binarySearch(myList, 4)

        assertThat(result.second).isNull()
    }
}
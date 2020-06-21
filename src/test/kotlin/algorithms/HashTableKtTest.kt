package algorithms

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

class HashTableKtTest {
    @Test
    fun `should return 'come in and vote' for new voter`() {
        val result = checkVoter("Katie")

        assertThat(result).isEqualTo("Come in and vote")
    }

    @Test
    fun `should return 'already voted' for existing voter`() {
        voted["Matt"] = true
        val result = checkVoter("Matt")

        assertThat(result).isEqualTo("Sorry, Matt has already voted")
    }
}
package algorithms

fun binarySearch(list: List<Int>, item: Int): Pair<Int, Int?> {
    var low = 0
    var high = list.indices.last()
    var guessCounter = 0

    while (low <= high) {
        val mid = (low + high) / 2
        val guess = list[mid]

        when {
            guess == item -> {
                guessCounter += 1
                println("Guessed index $mid correctly after $guessCounter guesses.")
                return Pair(guessCounter, mid)
            }
            guess > item -> {
                guessCounter += 1
                println("Guess of $mid is too high. Made $guessCounter guesses so far.")
                high = mid - 1
            }
            else -> {
                guessCounter += 1
                println("Guess of $mid is too low. Made $guessCounter guesses so far.")
                low = mid + 1
            }
        }
    }

    return Pair(guessCounter, null)
}
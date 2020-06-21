package algorithms

val voted = HashMap<String, Boolean>()

fun checkVoter(voter: String): String =
    if (voted[voter] == true) {
        "Sorry, $voter has already voted"
    } else {
        voted[voter] = true
        "Come in and vote"
    }


//---- Playground ----

fun main() {
    val books = HashMap<String, String>()

    books["Dickens"] = "Great Expectations"
    books["Dante"] = "Inferno"

    println(books)
    println(books["Dickens"])
    println(books["Thompson"])
}
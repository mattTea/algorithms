package algorithms

import kotlin.collections.HashMap

// including Graphs

@ExperimentalStdlibApi // in order to use ArrayDeque
fun main() {
    val graph = HashMap<String, List<String>>()

    graph["you"] = listOf("alice", "bob", "claire")
    graph["bob"] = listOf("anuj", "peggy")
    graph["alice"] = listOf("peggy")
    graph["claire"] = listOf("thom", "jonny")
    graph["anuj"] = emptyList()
    graph["peggy"] = emptyList()
    graph["thom"] = emptyList()
    graph["jonny"] = emptyList()

    fun closestMangoSellerTo(name: String): Boolean {
        val searchQueue = ArrayDeque<String>()
        searchQueue += graph[name]!!

        val alreadySearched = mutableListOf<String>()

        while (searchQueue.isNotEmpty()) {
            val person = searchQueue.removeFirst()
            if (!alreadySearched.contains(person)) {
                if (person.isMangoSeller()) {
                    println("The closest mango seller to $name is $person.")
                    return true
                } else {
                    searchQueue += graph[person]!!
                    alreadySearched += person
                }
            }
        }
        println("there are no mango sellers in $name's network")
        return false
    }

    closestMangoSellerTo("you")
}

private fun String.isMangoSeller() = this[lastIndex] == 'm'
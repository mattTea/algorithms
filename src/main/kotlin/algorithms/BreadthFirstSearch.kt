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

    val searchQueue = ArrayDeque<String>()

    searchQueue += graph["you"]!!

    fun closestMangoSeller(graph: HashMap<String, List<String>>): Boolean {
        while (searchQueue.isNotEmpty()) {
            val person = searchQueue.removeFirst()
            if (person.isMangoSeller()) {
                println("$person is your closest mango seller!")
                return true
            } else {
                searchQueue += graph[person]!!
            }
        }
        println("there are no mango sellers in your network")
        return false
    }

    closestMangoSeller(graph)
}

private fun String.isMangoSeller() = this[lastIndex] == 'm'
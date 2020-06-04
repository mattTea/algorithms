package algorithms

fun findIndexOfSmallestElement(list: List<Int>): Int {
    var smallest = list[0]
    var smallestIndex = 0

    for ((index, item) in list.withIndex()) {
        if (item < smallest) {
            smallest = item
            smallestIndex = index
        }
    }

    return smallestIndex
}

fun selectionSort(list: MutableList<Int>): List<Int> {
    val sortedList: MutableList<Int> = mutableListOf()

    for (number in 1..list.size) {
        val smallestItemIndex = findIndexOfSmallestElement(list)
        sortedList.add(list[smallestItemIndex])
        list.removeAt(smallestItemIndex)
    }

    return sortedList
}
package algorithms

fun quickSort(list: List<Int>): List<Int> {
    return if (list.size < 2) {
        list
    } else {
        val randomIndex = list.indices.random()
        val pivot = list[randomIndex]
        val lessThanPivot = (list - list[randomIndex]).filter { it <= pivot }
        val moreThanPivot = list.filter { it > pivot }

        quickSort(lessThanPivot) + pivot + quickSort(moreThanPivot)
    }
}
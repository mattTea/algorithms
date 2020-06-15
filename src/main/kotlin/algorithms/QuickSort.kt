package algorithms

fun quickSort(list: List<Int>): List<Int> {
    return if (list.size < 2) {
        list
    } else {
        val pivot = list.first()
        val lessThanPivot = list.drop(1).filter { it <= pivot }
        val moreThanPivot = list.filter { it > pivot }

        quickSort(lessThanPivot) + pivot + quickSort(moreThanPivot)
    }
}
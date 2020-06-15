package algorithms

fun quickSort(list: List<Int>): List<Int> {
    return when {
        list.size < 2 -> list
        list.size == 2 -> { if (list[0] < list[1]) list else list.reversed() }
        else -> {
            val pivot = list.first()
            val lessThanPivot = list.filter { it < pivot }
            val moreThanPivot = list.filter { it > pivot }

            quickSort(lessThanPivot) + pivot + quickSort(moreThanPivot)
        }
    }
}
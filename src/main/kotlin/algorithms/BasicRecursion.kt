package algorithms

fun countdown(number: Int) {
    println(number)
    if (number <= 1) {
        return
    } else {
        countdown(number - 1)
    }
}

fun factorial(x: Int): Int {
    return if (x == 1) {
        1
    } else {
        x * factorial(x - 1)
    }
}

fun sum(list: List<Int>): Int =
    if (list.isEmpty()) {
        0
    } else {
        list[0] + sum(list.drop(1))
    }


fun countNumberOfElements(list: List<Any>): Int {
    return if (list.isEmpty()) {
        0
    } else {
        1 + countNumberOfElements(list.drop(1))
    }
}

fun findHighestNumber(list: List<Int>, highestNumber: Int = 0): Int {
    var currentHighestNumber = if (highestNumber > list[0]) highestNumber else list[0]
    return if (list.size == 1) {
        currentHighestNumber
    } else {
        val newList = list.drop(1)
        if (newList[0] > currentHighestNumber) currentHighestNumber = newList[0]
        findHighestNumber(list.drop(1), currentHighestNumber)
    }
}

fun main() {
    println("-----COUNTDOWN-----")
    countdown(3)
    // # 3
    // # 2
    // # 1
    println("-----FACTORIAL-----")
    println(factorial(3))
    // # 6
    println("-----SUM-----")
    println(sum(listOf(2, 3, 5)))
    // # 10
    println("-----COUNT_ELEMENTS-----")
    println(countNumberOfElements(listOf(2, 3, "a")))
    // # 3
}
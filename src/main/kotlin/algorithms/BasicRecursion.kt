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

fun sum(list: List<Int>): Int {
    var total = 0
    for (int in list) {
        total += int
    }
    return total
}

fun countNumberOfElements(list: List<Any>, count: Int = 0): Int {
    var count = count
    return if (list.isEmpty()) {
        count
    } else {
        count += 1
        countNumberOfElements(list.drop(1), count)
    }
}

fun main() {
    println("-----COUNTDOWN-----")
    countdown(3)
    println("-----FACTORIAL-----")
    println(factorial(3))
    println("-----SUM-----")
    println(sum(listOf(2, 3, 5)))
    println("-----COUNT_ELEMENTS-----")
    println(countNumberOfElements(listOf(2, 3, "a")))
}
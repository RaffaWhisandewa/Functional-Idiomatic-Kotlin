package task2

// Lambda dari Task 1 (diulang di sini karena file ini punya package sendiri)
val double: (Int) -> Int = { it * 2 }
val startsWithVowel: (String) -> Boolean = {
    it.isNotEmpty() && it.first().lowercaseChar() in "aeiou"
}

fun applyTwice(n: Int, operation: (Int) -> Int): Int = operation(operation(n))

fun printIf(items: List<String>, condition: (String) -> Boolean) {
    items.filter(condition).forEach { println(it) }
}

fun <T> transform(list: List<T>, mapper: (T) -> String): List<String> = list.map(mapper)

fun main() {
    println(applyTwice(3, double))   // 12

    val courses = listOf(
        "Algoritma",
        "Basis Data",
        "Pemrograman Mobile",
        "Interaksi Manusia Komputer",
        "Etika Profesi"
    )
    printIf(courses, startsWithVowel)

    val squares = transform(listOf(2, 3, 4)) { (it * it).toString() }
    println(squares)                  // [4, 9, 16]
}
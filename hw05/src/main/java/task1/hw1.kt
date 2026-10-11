package task1

fun main() {
    // 1. Gandakan Int
    val double: (Int) -> Int = { it * 2 }
    println(double(7))

    // 2. Cek huruf awal vokal (abaikan huruf besar/kecil)
    val startsWithVowel: (String) -> Boolean = {
        it.isNotEmpty() && it.first().lowercaseChar() in "aeiou"
    }
    println(startsWithVowel("apple"))
    println(startsWithVowel("Banana"))
    println(startsWithVowel("orange"))

    // 3. Ambil nilai terbesar dari dua Int
    val larger: (Int, Int) -> Int = { a, b -> if (a > b) a else b }
    println(larger(12, 7))
}
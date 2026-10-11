package task4

data class Config(var host: String = "", var port: Int = 0, var debug: Boolean = false)

fun main() {
    // 1. apply: buat dan atur objek dalam satu ekspresi
    val config = Config().apply {
        host = "localhost"
        port = 8080
        debug = true
    }
    println(config)

    // 2. let: hanya jalan kalau tidak null
    val name: String? = "Rina"
    name?.let { println(it.uppercase()) }

    // 3. also: log sebelum, tambah elemen, log sesudah
    val numbers = mutableListOf(1, 2, 3)
    numbers
        .also { println("Before: $it") }
        .also { it.add(4) }
        .also { println("After: $it") }
}
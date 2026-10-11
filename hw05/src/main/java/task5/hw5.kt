package task5

import java.util.Locale

data class Student(val name: String, val score: Int, val year: Int)

val students = listOf(
    Student("Ali",   85, 2023),
    Student("Budi",  62, 2022),
    Student("Citra", 91, 2023),
    Student("Dewi",  58, 2022),
    Student("Eka",   76, 2023)
)

fun main() {
    // 1. partition: lulus dan tidak lulus
    val (passing, failing) = students.partition { it.score >= 70 }
    println("Passing: ${passing.size}   Failing: ${failing.size}")

    // 2. Nilai tertinggi dan terendah (aman dari null)
    students.maxByOrNull { it.score }
        ?.let { println("Top scorer : ${it.name} (${it.score})") }
    students.minByOrNull { it.score }
        ?.let { println("Low scorer : ${it.name} (${it.score})") }

    // 3. Rata-rata dengan fold, dibulatkan satu desimal
    val total = students.fold(0) { acc, student -> acc + student.score }
    val average = if (students.isEmpty()) 0.0 else total.toDouble() / students.size
    println("Class average: ${"%.1f".format(Locale.US, average)}")

    // 4. Ringkasan dengan buildString
    val report = buildString {
        appendLine("--- Grade Report ---")
        students.forEach {
            val status = if (it.score >= 70) "PASS" else "FAIL"
            appendLine("${it.name.padEnd(8)} ${it.score}  $status")
        }
    }
    print(report)
}
package adventOfCode.reportRepair

import java.io.File

fun main() {
    val numbers = File("src/main/kotlin/AdventOfCode/ReportRepair/input.txt")
        .readLines()
        .map(String::toInt)

    for (first in numbers) {
        for (second in numbers) {
            if (first + second  == 2020) {
                println("$first, $second")
                println(first * second)
                return
            }
        }
    }
}
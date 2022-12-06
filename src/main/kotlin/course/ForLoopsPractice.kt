package course

fun main() {
    println("Please enter a value")
    val input = readLine()?:"0"
    val maxValue = input.toInt()

    for (i in maxValue downTo 0) {
        if (i % 7 == 0) {
            println("$i")
        }
    }
}


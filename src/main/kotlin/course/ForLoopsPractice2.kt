package course

fun main() {
    println("Please enter a value")
    val input = readLine()?:"0"
    val size = input.toInt()

    for (i in 1..size) {
        for (j in 1..size) {
            when (i * j % 3) {
                0 -> print("\uD83D\uDE00\t")
                1 -> print("\uD83D\uDE31\t")
                2 -> print("\uD83E\uDD75\t")
            }
        }
        println()
    }
}


package course

fun main() {
    val name = "Michael"
    println(name.slim())
}

fun String.slim() = this.substring(1, length - 1).uppercase()
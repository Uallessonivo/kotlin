package course

fun main() {
    val test = readLine()

    try {
        // Try to do something
        println(test?.toInt())
    } catch (e: Exception) {
        // If an exception occurs, do this
        println("An exception happened: \n ${e.localizedMessage}")
    } finally {
        // always execute this part
        println("The execution has completed")
    }
}
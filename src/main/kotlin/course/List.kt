package course

fun main() {
    // Ordered collection that can contain duplicate elements and can contain null
    val colors = listOf("blue", "yellow", "red", null, "white")
    println(colors) // [blue, yellow, red]

    // if we create an empty list we must provide the type
    val colors2 = listOf<String>()
    println(colors2) // []

    // retrieve an element of the list
    println(colors[2]) // red
    println(colors[0]) // blue
    println(colors[10]) // exception

    // retrieve the size of list
    println(colors.size) // 5

    // Contains
    colors.contains("red") // true or false

    // Get index
    colors.indexOf("blue")
}
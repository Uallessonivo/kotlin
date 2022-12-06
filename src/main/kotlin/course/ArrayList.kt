package course

fun main() {
    // A mutable list
    val colors: ArrayList<String> = arrayListOf("blue", "red", "white")
    println(colors)

    // Empty
    val noColors = arrayListOf<String>()
    println(noColors)

    // Add
    colors.add("yellow")
    println(colors)

    // Add another collection
    val anotherColors = arrayListOf("black", "green")
    colors.addAll(anotherColors)
    println(colors)

    // Remove
    colors.remove("red")
    println(colors)

    // Remove all elements of a collection
    colors.removeAll(anotherColors.toSet())
    println(colors)

    // Remove from index
    colors.removeAt(2)
    println(colors)

    // Clear
    colors.clear()
    println(colors)
    println(colors.isEmpty())
}
package course

fun main() {
    // ?:
    // guarantees a result returned
    // Either the actual result for a non-null variable, or a default value

    val catName: String? = null
    println("The cat name is ${catName?:"Oops the cat has no name"}")

    val dogName: String? = "Fluffy"
    println("The dog name is ${dogName?:"Oops the dog has no name"}")
}
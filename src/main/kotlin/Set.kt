fun main() {
    // Stores unique elements in an undefined order
    val numbers = setOf(6, 37, 6, 42)
    println(numbers) // [6, 37, 42]

    // Empty Set
    val numbers2 = setOf<Int>()
    println(numbers2) // []

    // Can set null values
    val numbers3 = setOf(6, 5, 2, null, 8, 5, 7, null, 4, null)
    println(numbers3) // [6, 5, 2, null, 8, 7, 4]
}
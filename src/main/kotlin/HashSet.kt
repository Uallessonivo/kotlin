fun main() {
    // A Mutable set
    val numbers = hashSetOf(1, 2, 3, 4, 5)
    numbers.add(6)
    val newNumbers = hashSetOf(7, 8)

    // Add
    numbers.addAll(newNumbers)
    // Remove
    numbers.remove(8)

    println(numbers) // [1, 2, 3, 4, 5, 6, 7]
}
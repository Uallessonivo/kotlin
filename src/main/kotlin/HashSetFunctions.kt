fun main() {
    val numbers = hashSetOf(3, 7, 5, 4, 6)
    val newNumbers = hashSetOf(7, 2, 5 ,9 , 6)

    // True or false
    println(numbers.retainAll(newNumbers))
}
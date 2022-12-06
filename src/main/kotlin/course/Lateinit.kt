package course

fun main() {
    lateinit var message: String
    val primeNumbers = listOf(2,3,5,7,11,13,17,23)

    message = "The chosen prime number is ${selectPrimeNumbers(primeNumbers)}"
    println(message)
}

fun selectPrimeNumbers(primes: List<Int>) = primes.random()
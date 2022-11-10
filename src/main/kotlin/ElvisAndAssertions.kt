fun main() {
   val productPrice = 29.99
    println("How many products would you like to buy?")
    val input = readLine()
    val purchasedProducts = input?.toInt()?:1
    println("Total is ${purchasedProducts * productPrice}")
}
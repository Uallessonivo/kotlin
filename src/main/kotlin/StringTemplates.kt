import java.util.*

fun stringTemplates(args: Array<String>) {
    val catName = "Ham-taro"
    println("My cat's name is $catName")
    println("The catName variable length is ${catName.length}")

    val myCar = "My car won't start"
    println(myCar.substring(3,6))

    val clientName = "John"
    println("Hello $clientName welcome to the store!")

    val client = "Mary"
    val products = 3
    val price = 6
    println("Hello $client your total amount is ${products * price}")
}
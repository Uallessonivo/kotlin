package course

fun main() {
    println("What is your name?")
    val name = readLine()?:""
    CoffeeShop().sellCoffee(name)
}

class CoffeeShop {
    fun sellCoffee(name: String) {
        CoffeeCup().apply {
            clientName = name
            prepareCoffee()
            println("Serving coffee to client $clientName")
        }
    }
}

class CoffeeCup {
    var clientName = ""
    fun prepareCoffee() {
        println("Brewing the coffee")
    }
}

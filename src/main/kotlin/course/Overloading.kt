package course

fun main() {
    // Two functions can have the same name if they have the different numbers or types of parameters
    println(multiply(5))
    println(multiply(5, 5))

    println(sayHello("Uallesson"))
    println(sayHello(listOf("Uallesson", "Lua", "Neuza")))
}

fun multiply(number: Int) = number * 2
fun multiply(number: Int, multiplier: Int) = number * multiplier


fun sayHello(person: String) {
    println("Hello $person!")
}

fun sayHello(people: Collection<String>) {
    for (person in people) {
        println("Hello $person!")
    }
}
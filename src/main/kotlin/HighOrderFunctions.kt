fun main() {
    // Is a function that takes another function as a parameter
    val names = arrayListOf("Alice", "Bob", "Carol", "Dan")
    val myLambda = {name: String -> println("Hello $name!")}
    sayHello(names, myLambda)
}

fun sayHello(names: ArrayList<String>, doSomething: (String) -> Unit) {
    for (name in names) {
        doSomething(name)
    }
}
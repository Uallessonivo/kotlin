package course

fun main() {
    // A Lambda is an anonymous function (has no name)
    // A Lambda function can be assigned to a variable
    // The variable can be passed as a parameter to a new function higher order functions
    val myLambda = {name: String -> println("Hello $name")}
}

package course

fun input() {
    println("Input something")
    // Return a String
    val userStringInput = readln()
    println(userStringInput)
    //
    //
    println("Input something")
    // Return a Number
    val userNumberInput = readln()?:""
    println("Double is: ${userNumberInput.toInt() * 2}")
}

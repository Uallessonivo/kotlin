package OOP_Principles

// A Class can inherit variables and methods from another class
// To make a class inheritable, use the "open" keyword
// "Daughter" classes can override methods in "Mother" classes using "override" keyword if they are marked as open
// "Daughter" classes can access "Mother" class methods and variables using the "super" keyword

fun main() {
    val carol = Daughter()
    println(carol.hairColor)
    carol.mothersSpec()
    carol.daughterSay("Hi")
}

open class Mom {
    open val hairColor = "Brown"
    open val eyeColor = "Blue"

    fun say (message: String) {
        println("Mom says $message")
    }
}

class Daughter: Mom() {
    override val hairColor = "Blonde"
    override val eyeColor = "Black"

    fun daughterSay(message: String) {
        println("Daughter says $message")
    }

    fun mothersSpec() {
        println("Mom has ${super.hairColor} hair color")
        println("Mom has ${super.eyeColor} eye color")
    }
}
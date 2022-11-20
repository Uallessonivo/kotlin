package OOP_Principles

// Variables and functions are available only in the block of code they are declared int
// Classes can change the scope of their variables / functions

// Modifiers
// private - visible inside the class only
// protected - visible inside class and inheriting classes
// internal - visible inside package
// public - visible to anyone accessing the class * DEFAULT

fun main() {
}

open class Airplane {
    protected val type = "Airbus"

    protected fun fly() {
        println("Flying")
    }
}

class MyAirplane: Airplane() {
    fun takeOff() {
        println(type)
        fly()
    }
}

// This will cause an error, "OtherAirplane" don't inherit "Airplane" and variables / functions of "Airplane" is "protected"
//class OtherAirplane {
//    fun takeOff() {
//        val airplane = Airplane()
//        println(airplane.type)
//        airplane.fly()
//    }
//}

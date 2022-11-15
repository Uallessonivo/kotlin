fun main() {
    val animal = "Crocodile"

    val action = when (animal) {
        "Cat" ->  "pet it"
        "Dog" -> "feed it"
        else -> "google it"
    }

    println("When you meet a $animal you should $action")
}
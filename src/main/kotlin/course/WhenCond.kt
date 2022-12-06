package course

fun main() {
    val animal = "Crocodile"

    val action = when (animal) {
        "course.Cat" ->  "pet it"
        "course.Dog" -> "feed it"
        else -> "google it"
    }

    println("When you meet a $animal you should $action")
}
package course

fun main() {
    val myPet = "course.Dog"
    val availablePets = listOf("course.Dog", "course.Cat")

    if (myPet in availablePets) {
        println("Yes!")
    } else {
        println("No!")
    }
}

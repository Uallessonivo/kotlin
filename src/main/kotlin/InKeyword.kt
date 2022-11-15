fun main() {
    val myPet = "Dog"
    val availablePets = listOf("Dog", "Cat")

    if (myPet in availablePets) {
        println("Yes!")
    } else {
        println("No!")
    }
}

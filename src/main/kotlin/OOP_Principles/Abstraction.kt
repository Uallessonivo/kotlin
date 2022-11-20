package OOP_Principles

// Functionality that is not associated with an instance should be abstracted away
// If 2 classes share common features, create a super class that contains the common features and inherit from it
// If the super class has abstract methods, the classes that inherit it will have to implement those methods.

fun main() {
    val dog = Dog("Hulk")
    val bird = Bird("Hex")

    // Dog
    dog.fly()
    dog.run()
    dog.play()

    // Bird
    bird.play()
    bird.run()
    bird.fly()
}

abstract class Animal(name: String) {
    abstract fun run()
    abstract fun fly()
    abstract fun play()
}

class Dog(private val name: String): Animal(name) {
    override fun run() {
        println("A $name can run!")
    }

    override fun fly() {
        println("A $name CANNOT fly!")
    }

    override fun play() {
        println("A $name can play!")
    }
}

class Bird(private val name: String): Animal(name) {
    override fun run() {
        println("A $name CANNOT run!")
    }

    override fun fly() {
        println("A $name can fly!")
    }

    override fun play() {
        println("A $name can play!")
    }
}
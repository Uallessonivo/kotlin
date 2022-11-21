fun main() {
    // An interface is a definition of a part of a class
    // Tell what a class / object can do
    // Objects can access other objects through their interfaces
    val rest1: Restaurant = LocalRestaurant()
    rest1.provideFood()
    rest1.provideBill()
    //
    val rest2: Restaurant = FancyRestaurant()
    rest2.provideFood()
    rest2.provideBill()
}

interface Restaurant {
    fun provideFood()
    fun provideBill()
}

class LocalRestaurant: Restaurant {
    override fun provideFood() {
        println("Your local restaurant provides food and drinks")
    }

    override fun provideBill() {
        println("Please pay 25")
    }
}

class FancyRestaurant: Restaurant {
    override fun provideFood() {
        println("This is the most delicious food i have ever tried")
    }

    override fun provideBill() {
        println("Please pay 100")
    }
}
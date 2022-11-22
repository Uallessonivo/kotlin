fun main() {
    with(Store()) {
        shoes = 25
        shirts = 30
        jackets = 10
        printInventory()
    }
}

class Store {
    var shoes = 50
    var shirts = 10
    var jackets = 30

    fun printInventory() {
        println("Ths store has $shoes shoes, $shirts shirts nad $jackets jackets")
    }
}

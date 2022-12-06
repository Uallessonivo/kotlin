package course

fun main() {
    val table1 = Table()
    val table2 = Table(1)
    val table3 = Table(6,175)

    table1.printInfo()
    table2.printInfo()
    table3.printInfo()
}

class Table {
    constructor() {
        legs = 3
        height = 120
    }

    constructor(newLegs: Int) {
        legs = newLegs
        height = 120
    }

    constructor(newLegs: Int, newHeight: Int) {
        legs = newLegs
        height = newHeight
    }

    var legs = 4
    var height = 150

    fun printInfo() {
        println("This table has $legs legs and a height of $height")
    }
}
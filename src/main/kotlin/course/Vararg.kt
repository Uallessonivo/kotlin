package course

fun main() {
    println(sumOfInt(4,5,6,87,9,321,4))
    println(sumOfInt(1,8,6,4,5,3,7,9,45))
}

fun sumOfInt(vararg numbers: Int): Int {
    var sum = 0
    for (number in numbers) {
        sum += number
    }
    return sum
}

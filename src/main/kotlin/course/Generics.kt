package course

fun main() {
    val info = Info<String>()
    info.getLength("Some string")

    val info2 = Info<Double>()
    info2.getLength(34.465465)

    val info3 = Info<ArrayList<Int>>()
    info3.getLength(arrayListOf(4,5,7,9,32,456))
}

class Info<T> {
    fun getLength(item: T) {
        println(item.toString().length)
    }
}
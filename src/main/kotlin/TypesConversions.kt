fun typesConversions() {
    // Byte < Short < Int < Long < Float < Double
    // this will convert only the result, not the original value
    val cats = 3
    val longCats = cats.toLong()
    println(cats::class.java)
    println(longCats::class.java)


    // Float to Int --> Lost information
    val pi = 3.14159
    println("$pi is a ${pi::class.java}")

    val piFloat = pi.toInt()
    println("$piFloat is a ${piFloat::class.java}")


    // Converting the input
    println("Please enter a number")
    val numberInt = readLine()?:""
    val myByte = numberInt.toByte()
    println(myByte)
    println("$myByte is a ${myByte::class.java}")
}

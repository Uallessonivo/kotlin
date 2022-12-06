package course

fun main() {
    // A Mutable Map
    val count = hashMapOf<Int, String>(Pair(1, "One"), Pair(2, "Two"), Pair(3, "Three"))
    println(count)

    // Adding elements
    count[4] = "Four"
    println(count)

    // Replace elements
    count.replace(2, "TwoTwo")
    println(count)

    // Remove all
    count.clear()
    println(count)

    // Contains Key
    println("Does the map have the key 2?: ${count.containsKey(2)}")
    println("Does the map have the key 5?: ${count.containsKey(5)}")

    // Contains Value
    println("Does the map have the value 'One'?: ${count.containsValue("One")}")
    println("Does the map have the value 'Five'?: ${count.containsValue("Five")}")
}
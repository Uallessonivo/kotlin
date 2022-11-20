package OOP_Principles

// One name many forms
// A method can do different things in different situations
// Has two types
// Dynamic - method overriding
// Static - method overloading

fun main() {
    val tv = TV()
    tv.getChannel("5")
    tv.getChannel("4", true)
    tv.getChannel("6", "13:00")
}

class TV {
    fun getChannel(id: String) {
        println("Regular broadcast for channel $id")
    }

    fun getChannel(id: String, subtitles: Boolean) {
        println("Regular broadcast for channel $id")
        if (subtitles)
            println("with subtitles")
        else
            println("without subtitles")
    }

    fun getChannel(id: String, time: String) {
        println("Regular broadcast for channel $id at $time time")
    }
}
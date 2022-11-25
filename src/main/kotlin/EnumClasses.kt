// The medals in the olympics are
// GOLD 1st place
// SILVER 2nd place
// BRONZE 3rd place
// NONE OTHER

//Create a class Olympics that has a function which return the medal
//a contestant won based on the position they finished on.
//It also has a function which return the position of a contestant based on the medal they won.
//Create an object of that class and call its methods.

fun main() {
    val olympics = Olympics()
    println(olympics.getMedal(1))
    println(olympics.getMedal(2))
    println(olympics.getMedal(7))

    println(olympics.getPosition(Medal.GOLD))
}

enum class Medal(val position: Int) {
    GOLD(1),
    SILVER(2),
    BRONZE(3),
    NONE(4),
}

class Olympics {
    fun getMedal(position: Int): Medal {
        return when(position) {
            1 -> Medal.GOLD
            2 -> Medal.SILVER
            3 -> Medal.BRONZE
            else -> Medal.NONE
        }
    }

    fun getPosition(medal: Medal) = medal.position
}
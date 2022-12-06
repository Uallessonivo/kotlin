package course

fun main() {
    val jetpack = JetPack()
    jetpack.burn(10)
    println("User height is ${jetpack.userHeight}")
    jetpack.stop(2)
    println("User height is ${jetpack.userHeight}")
    jetpack.burn(5)
    println("User height is ${jetpack.userHeight}")
    jetpack.stop(8)
}

class JetPack {
    var userHeight = 0

    fun burn(seconds: Int) {
        userHeight += seconds
    }

    fun stop(seconds: Int) {
        userHeight -= 3 * seconds
        if (userHeight < 0)
            userHeight = 0
    }
}
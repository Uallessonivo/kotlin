fun main() {
    val clients = arrayListOf<String?>()
    var stopAction = false

    while (!stopAction) {
        println("Input a client's name")
        val input = readLine()
        input?.let {
            when (it) {
                "" -> clients.add(null)
                "stop" -> stopAction = true
                else -> clients.add(it)
            }
        }
    }

    clients.forEach {
        println("Client: $it")
    }
}
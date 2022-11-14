fun main() {
    // A map is a set of key-value pairs
    // Keys are unique, values can be duplicates
    val accounts = mapOf(Pair(1, "Uallesson"), Pair(2, "Juliana"), Pair(3, "Neuza"))
    println(accounts)
    println(accounts[2])
    println(accounts.keys)
    println(accounts.values)
    // Empty map
    val newAccounts = mapOf<Int, String>()
    println(newAccounts)
}
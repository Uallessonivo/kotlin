fun nullAbility() {
    // Kotlin differentiates between variables that can be null and those that cannot
    val herName: String = "Lilly"
    val hisName: String? = null

    println(herName)
    println(herName.length) // always returns the length
    println(hisName)
    println(hisName?.length) // return null if value is null or returns the length

    // The null keyword is used to assign the value null to a nullable value
    var catName: String? = "Ham-taro"
    catName = null // OK

    var dogName: String = "Fluffy"
    //dogName = null // Compilation error
}

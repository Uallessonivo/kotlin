package course

fun nullAbilityArithmetic() {
    val a: Int? = 10

    println(a?.plus(4))
    println(a?.minus(3))
    println(a?.times(3))
    println(a?.div(3))
    println(a?.rem(3))
}

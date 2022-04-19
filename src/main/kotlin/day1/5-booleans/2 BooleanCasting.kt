package day1.`5-booleans`

fun main() {
    println("Checking to boolean function")

    println("true".toBoolean())
    println("false".toBoolean())
    println("True".toBoolean())
    println("False".toBoolean())
    println("trUe".toBoolean())
    println("FALSE".toBoolean())
    //to boolean is not case sensitive.
    println("false".toBooleanStrict())
    //"toBooleanStrict" it is case sensitive (lover case only)

    val a = true
    val b = true

    println(a.and(b))
    println(a.or(b))
    println(a.xor(b))
    println(a.not())
    //in kotlin we have specific methods for logic elements
}
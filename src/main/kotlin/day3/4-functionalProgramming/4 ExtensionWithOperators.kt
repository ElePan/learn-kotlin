package day3.`4-functionalProgramming`

data class Balance (var value: Double) {
    fun check(inc: Double) = true
}

//fun check(inc: Int) = this.check(inc.toDouble())

operator fun Balance.times(inc: Double) {
    this.value = value * inc
} //times operator is *, so using it you will have this behaviour

infix fun Balance.customAdd(inc: Double) {
    this.value = value + inc
}

fun main() {
    val x = Balance(2.0)
    println(x)

    x * 3.0 // x.times(3.0)
    println(x)

    x customAdd 1.0
    println(x)

}
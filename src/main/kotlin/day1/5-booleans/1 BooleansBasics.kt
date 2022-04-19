package day1.`5-booleans`

fun main() {

    val t = true
    val a = !t

    println("t=$t, a=$a")
    println("t&&a => ${a && t}")

    fun logger(x: Boolean): Boolean {
        println("logger $x")
        return x
    }

    println("a && t => ${logger(a) && logger(t)}")
    println("a || t => ${logger(a) || logger(t)}")
    println("t || a => ${logger(t) || logger(a)}")
}

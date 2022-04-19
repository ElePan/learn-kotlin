package day1.`6-numbers`

fun main() {
    val a = 111111111111111
    //automatically saved as Long, as it is too big for the default (int)
    println(a is Long)
    val b = 111.12111111111111
    //automatically saved as Double
    println(b is Double)

    val c = 111.12111111111111f
    //we force to save it as Float, in this case is saved as float but we loose precision
    println(c is Float)

    val d = 0x15af
    println(d)
    val e = 0b011
    println(e)

    val million = 1_000_000
    //we can add underscores in number without change the value (just more readable)
    println(million)

    println(12.toByte())
    //if number is very big we loose precision

    println(14/3) //result is an integer as both the inputs are
    println(14.0/3) //result is float as an input it is
}

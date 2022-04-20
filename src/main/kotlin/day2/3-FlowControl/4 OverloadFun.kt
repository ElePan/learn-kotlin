package day2.`3-FlowControl`

fun main() {
    //Overload only works with same name and return type of the function

    fun a(x: Int) = println("My param is $x")
    fun a() = println("No params")
    //Override the behaviour of "a" fun in the case of no params

    println(a(4))
    println(a())

    fun b(x: Int = 12) = println("My b param is $x")
    fun b() = println("No b params")
    //Which to use if no param? b() or b with default?

    println(b(4))
    println(b()) //it calls b() and not b with default
}
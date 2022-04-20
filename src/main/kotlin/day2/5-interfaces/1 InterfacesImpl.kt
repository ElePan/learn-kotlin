package day2.`5-interfaces`

interface Animal { //open not needed
    fun describe() //no abstract needed
    fun describeBetter()
    fun sayHello() { println("Hey") }
}

abstract class Cat(): Animal {
    override fun describe() {
       println("I'm a sweet kitty")
    }
}

class NorwegianCat(): Cat(){
    override fun describeBetter() {
        println("I'm a norwegian cat")
    }
}

fun main() {
    val c = NorwegianCat()
    c.sayHello(); c.describe(); c.describeBetter()
}

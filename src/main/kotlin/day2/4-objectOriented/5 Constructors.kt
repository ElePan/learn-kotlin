package day2.`4-objectOriented`

class Animal(var name: String) {
    //first constructor (with name) is automatically created
    var legs = 4
    constructor(name: String, legs: Int): this(name) {
        this.legs /*Refers to var in animal*/ = legs /*input*/
    }

    fun show() = println("My Animal is the $name and has $legs legs")
    //Member function = a function inside a class

    override fun toString(): String {
        return "Animal $name legs $legs"
    }
}

fun main() {
    val c = Animal("cat")
    val k = Animal("kangaroo", 2)

    c.show(); k.show()

    println(c) //it uses toString inside, overriding it in the method show the object correctly

}
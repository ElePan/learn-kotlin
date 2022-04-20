package day3.`4-functionalProgramming`

//Extensions: If you have an object you can add externally new functionalities

data class Dog(val name: String)

//I can extend in another file (common use)
fun Dog.showName() = println("My name is $name") //I have access to Dog variables (name in this case)

fun String.customSum(): Int = this.length //you can extend also kotlin's classes

fun main() {
    val b = Dog("Bobby")
    b.showName()

    val seven="seven"
    println(seven.customSum())
}
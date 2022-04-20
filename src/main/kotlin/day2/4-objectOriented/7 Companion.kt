package day2.`4-objectOriented`

class MyClass {
    companion object MyName {
        fun hello() = println("Hello")
    }
}

fun main() {
    val x = MyClass()

    MyClass.hello()
}
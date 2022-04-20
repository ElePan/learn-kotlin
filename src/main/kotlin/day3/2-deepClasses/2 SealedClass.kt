package day3.`2-deepClasses`

abstract sealed class ActionAbstract
sealed class ActionClass
sealed interface Action //more common use

//Similar to Java sealed classes (from java 15)

//Implementation: only in the same package
class GoForward: Action
class GoBackward: Action
class GoUp: Action
class GoDown: Action

fun main() {
    val a: Action = GoUp()
    //as it is Action must be one of the 4 implementation created

    when (a) {
        is GoUp -> println("it's up")
        is GoDown -> println("it's down")
        is GoForward -> println("it's forward")
        is GoBackward -> println("it's backward")
    } //this work with pattern matching
}
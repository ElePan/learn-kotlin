package day3.`3-patternMatching`

sealed interface Action //more common use

//Implementation: only in the same package
class GoForward: Action
class GoBackward: Action
class GoUp: Action
class GoDown: Action

fun main() {
    val a: Action = GoUp()

    when (a) {
        is GoUp -> println("it's up")
        is GoDown -> println("it's down")
        is GoForward -> println("it's forward")
        is GoBackward -> println("it's backward")
    } //we put all cases

    when (a) {
        is GoDown -> println("it's down again")
        else -> println("not go down case")
    } //we use else for default behaviour
}

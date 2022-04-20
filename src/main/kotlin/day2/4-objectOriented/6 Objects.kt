package day2.`4-objectOriented`

/*Concept: Object
is like a singleton class, there is only one instance of this class
 */
object Tree {
    val leaves = 1000

    fun shows() = println("My tree has $leaves leaves")
}

class Basil {
    var leaves = 50

    companion object {
        var bugs = 2
    }

    fun moreBugs(){
        bugs ++
    }
}

fun main() {
    val t = Tree //I'm using the existing instance
    // val x = Tree() not compiling, I can't create a new instance

    t.shows()

    //If I don't need to use the state (utils functions for example) I should use an object

    val firstPlant = Basil()
    val secondPlant = Basil()

    println("Current bugs: $Basil.bugs")
    println("One bug in fist plant")
    firstPlant.moreBugs()
    println("Current bugs: $Basil.bugs")
    println("One bug in second plant")
    secondPlant.moreBugs()
    println("Current bugs: $Basil.bugs")
    //bugs is shared, unique for all Basil plants. Every plant can increase the number.
}
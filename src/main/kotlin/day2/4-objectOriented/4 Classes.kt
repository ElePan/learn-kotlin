package day2.`4-objectOriented`

//One file => several public classes (if you want)

//default scope for classes is public but automatically are "final"
//if you want inheritance you must set them to "open"
class Bear

class Wolf {
    fun hello () = println("Wolfhola")
}

class Rabbit {
    var name: String = "Bunny"
}

class Squirrel(name: String) {
    private val intName = name
    fun hello () = println("Hey $intName")
}

//classes automatically are "final"
//if you want inheritance you must set them to "open"
open class Deer(val name: String) {
    //Automatically creates variable and constructor
    open fun hello () = println("Hey $name")
    //also methods are automatically final

}

class Snake() : Deer("Name") {}

class Fox() : Deer("Foxy") {
    override fun hello() = println("What does the fox say?")
}


fun main() {
    val x = Wolf() //this is a new class instance
    x.hello()

    val r = Rabbit()
    println(r.name)

    Squirrel("Lulu").hello()

    val s = Squirrel("Toto")
    s.hello()

    Deer("Bobby").hello()

    Snake().hello()
    //Hello method is declared in deer, but snake have it for inheritance

    Fox().hello()
}
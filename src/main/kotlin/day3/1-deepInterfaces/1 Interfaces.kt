package day3.`1-deepInterfaces`

interface Vehicle {
    val wheels: Int
}

class Car: Vehicle {
    override val wheels: Int = 4
}

class Vespa(override val wheels: Int = 2): Vehicle //2 are the default value

class Bicycle: Vehicle{
    override val wheels: Int
        get() = 2

}

fun main() {
    val c = Car()
    println("Car wheels $c.wheels")

    val v = Vespa()
    println("Vespa wheels $v.wheels")

    val specialVespa = Vespa(3)
    println("Special Vespa wheels $specialVespa.wheels")

    val b = Bicycle()
    println("Bicycle wheels $b.wheels")

}

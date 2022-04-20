package day2.`4-objectOriented`

//Abstract class: You must override it to use it
abstract class GenericAnimal { //open not needed, as it is mandatory to be implemented
    abstract val name: String
    abstract fun describe(): String //to be implemented
    fun sayHello() = println("Holita from $name")
}

class Dog(override val name: String): GenericAnimal(){
    override fun describe(): String {
        return "I'm a dog $name"
    }

    fun onlyDogThinghy() {
        println("Guau")
    }
}


fun main() {
    val d = Dog("Poncho")
    println(d.describe())
    d.sayHello()
    d.onlyDogThinghy()

    val gd: GenericAnimal = Dog("Morocco")
    gd.sayHello() //as in generic animal is not implemented it use the dog one
    //gd can't use onlyDogThinghy() as it is cast to a generic animal

}
package day3.`6-kotlinOptions`

data class Person(val name:String, val age:Int)

fun main() {
    val claire = Person("Claire", 22)

    //Scope Operators (same effect, interchangeable)

    claire.let { println(it.name); println(it) }

    claire.run { println(this.name); println(this) }

    with(claire){ println(this.name); println(this) }

    claire.apply {  println(this.name); println(this) }

    claire.also { println(it.name); println(it) }

    //you can use it as Elvis operator or to avoid repeat long variable names

    val noPerson: Person? = null
    noPerson?.let { println(it.name); println(it) } //it is executed only if the object is not null
}
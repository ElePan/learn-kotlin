package day1.`1-introduction`

/*Similar to java: jdk, compiler, types, are  compatible*/
fun main() {
    myfunc()
    myfuncUnit()
    println(myfuncString())
}

fun myfunc () {
    println("Hello")
}

fun myfuncUnit () : Unit {
    //unit means that there is no return (could be omitted as in myfunc)
    println("World")
}

fun myfuncString () : String {
    //that means the return type is a string
    return "I'm a string"
}
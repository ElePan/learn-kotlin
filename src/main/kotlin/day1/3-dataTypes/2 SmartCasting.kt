package day1.`3-dataTypes`

fun main() {
    val a: Any = "Hello"
    val b: Any = 12

    uppercaseIfString(a)
    uppercaseIfString(b)
    uppercaseIfStringInverse(a)
    uppercaseIfStringInverse(b)
}

fun uppercaseIfString(x: Any) {
    if (x is String){
        //Here kotlin knows that x is a string, as we have checked it.
        //We have access to all methods of string
        println(x.uppercase())
    } else {
        println("Not a string")
    }
}

fun uppercaseIfStringInverse(x: Any) {
    if (x !is String){
        println("I don't know the type")
    } else {
        //Here kotlin knows that x is a string, as we have checked it.
        //We have access to all methods of string
        println(x.uppercase())
    }

    /*
    * (x !is String || x.lenght == 0)
    * lenght is from string, it is an or so the second condition know what the first one was false,
    * so x is a string
    *
    * (x.lenght == 0 || x !is String) will not compile
    * */
}
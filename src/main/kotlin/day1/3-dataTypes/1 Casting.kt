package day1.`3-dataTypes`

fun main() {
    println(isString("aaa"))
    println(isString(1))

    println(isNotString(1))
    println(isNotString(1))

    val a: Any = "aaaaaa"
    val b: Any = 12
    println(a.toString())
    //the toString cast an object to a string
    println(b.toString())
    //every object could be cast to string

    val c: String = a as String
    /* Java way to cast, forced to be read as string with no operation!
    "b as String" will fail, b.toString() use a method and not fail */
    print(c)


    println(12.toDouble()) // int 12 => double 12,0
    println(12.3.toInt()) // double 12,3 => int 12


    val d = arrayListOf(1, 2)
    //arraylist is a mutable type
    d[0] = 2
    println(d)

    val e = mutableListOf(1,2)
    e[0] = 2
    //e = mutableListOf(5,6) not compiling, e is val! I can change content of his mutable list but
    //not reassign it with a new one
    println(e)
}

fun isString(x: Any): Boolean {
    //"is" operator identify types of objects (Any)
    if (x is String){
        return true
    }
    return false
}

fun isNotString(x: Any): Boolean {
    //the ! means "not"
    if (x !is String){
        return true
    }
    return false
}

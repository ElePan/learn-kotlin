package day2.`1-otherTypes`

fun main() {
    val internal = mutableListOf("aa", "bb", "cc")
    val secure: List<String> = internal
    //only one list is saved in memory, good performance

    internal += "ddd"
    //changing internal also secure is modified

    println("secure list> $secure")

    //secure += "eee" not compiling, thanks to casting secure in not mutable

    println(internal === secure)
    //should be true as it is the same list in memory
}
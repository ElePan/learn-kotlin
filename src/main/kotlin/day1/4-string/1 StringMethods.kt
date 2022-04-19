package day1.`4-strings`

fun main() {
    val e = "Elena"
    val j = "    Juan    "

    println(e.length) //# chars
    println(e.reversed())
    println(e + j) //string concat
    println(e.uppercase())
    println(e.lowercase())


    println("-" + j.trim()+ "-") //remove all spaces
    println("-" + j.trimStart()+ "-") //remove spaces before the word
    println("-" + j.trimEnd() + "-") //remove spaces after the word

    println(e.padEnd(25, '*')) // add * until arrive at 25 chars
    println(e.padEnd(25, '*').length) // total # chars should be 25

}

package day1.`4-strings`

fun main() {

    val name = "Elena"
    //string interpolation template
    println("Hello $name, nice to meet you")
    println("Hello ${name.uppercase()}, nice to meet you again")
    //with {} you can add methods to the variable

    val greetings = "Hello " + name +", nice to meet you"
    println(greetings)
    //same result but worst performance result, prefer to use string templates

    println("Hello ${if (name.length == 0) "<empty>" else name.uppercase()}, nice to meet you")

    println("Hello \$name, you are a dollar")
    //if you want to print the dollar you can escape t
    println("Hello \\ \$name, you are a dollar")
    //same escape for \

    val multiLine = """
        I
         am 
          multi
           line!
    """.trimIndent()
    println(multiLine)

    val multiLineBar = """
        |I
        | am 
        |  multi
        |   line!
    """.trimMargin()
    //bar and trim margin works as trim indent
    println(multiLineBar)

    val n = """Heu, \n not real new line"""
    println(n)
    val rn = """Heu, ${"\\n"} not real new line"""
    println(rn)
}
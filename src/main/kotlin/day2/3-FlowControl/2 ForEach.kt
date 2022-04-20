package day2.`3-FlowControl`

fun main () {
    val l = listOf("one", "two")

    println("inline")
    for (item in l) println("inline item $item")

    println("normal")
    for (item in l) {
        println("inline item $item")
    }

    println("range")
    for (i in 1 .. 10) {
        println("range, $i")
    }

    println("exclusive range")
    for (i in 1 until 10) {
        println("exclusive range, $i")
    }

    println("range steps")
    for (i in 1 .. 10 step 2) {
        println("step range, $i")
        //it will print, 1, 3, 5 etc
    }

    println("reverse range steps")
    for (i in 10 downTo 1 step 2) {
        println("step range, $i")
        //it will print, 10, 8, 6 etc
    }
}
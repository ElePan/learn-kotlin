package day2.`3-FlowControl`

fun main() {
    var x = 0

    while(x < 10) {
        println("While $x")
        x++
    }

    x = 10
    do {
        println("do while $x")
        x++
    } while (x < 10)
    //1st execution before check the condition, always at least one execution

    x = 0
    while(x < 10) {
        println("While $x")
        x++
        if (x == 3) break
        //to stop the execution of a loop we can use break (not recommended)
    }

    x = 0
    while(x < 10) {
        println("While $x")
        x++
        if (x == 3) continue
        //to skip the execution of this element
    }
}
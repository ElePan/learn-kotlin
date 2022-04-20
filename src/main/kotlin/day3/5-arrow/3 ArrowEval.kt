package day3.`5-arrow`

import arrow.core.Eval

/* 3 types of Eval:
now = execute at the moment
later = only one time
always = execute every time
 */


fun main() {
    fun logger(x: Int): Int {
        println("log $x")
        return x
    }

    val n = Eval.Now(logger(1)) //At this moment there is one execution of logger function

    //EVAL NOW

    var counter = 0
    val map = n.map { x -> logger(counter ++); x+1 } //this is a lambda declaration, no execution here
    println("Now -Counter -> $counter") //it is zero

    var extract = map.value() //second execution, counter is 1
    println("Now - Counter -> $counter, # value extraction $extract")

    extract = map.value() //third execution, counter is 2
    println("Now - Counter -> $counter, # value extraction $extract")

    //EVAL LATER

    counter = 0
    val l = Eval.later {logger(counter ++); counter} //At this moment there is no execution of logger function. LAZY execution.

    extract = l.value() //first execution, counter is 1
    println("Later - Counter -> $counter, # value extraction $extract")

    extract = l.value() //no execution, later is executed only one time counter is 1
    println("Later - Counter -> $counter, # value extraction $extract")

    //EVAL ALWAYS

    counter = 0
    val a = Eval.always {logger(counter ++); counter} //At this moment there is no execution of logger function. LAZY execution.

    extract = a.value() //first execution, counter is 1
    println("Always - Counter -> $counter, # value extraction $extract")

    extract = a.value() //second execution, counter is 2
    println("Always - Counter -> $counter, # value extraction $extract")
}
package day3.`5-arrow`

import arrow.core.None
import arrow.core.Option
import arrow.core.Some
import arrow.core.some

//Add in build gradle implementation("io.arrow-kt:arrow-core:1.0.1")

fun getRowFromDB(id: Int): Option<String> {
    if(id < 20){
        return Some("Row1")
    } else {
        return None
    }
}

fun main() {
    //object Option could be None if there is no data or Some and the data
    val a: Option<String> = None
    val b: Option<String> = Some("Help")
    val c: Option<String> = "Help".some()
    //c and d are equals, two different syntax

    println(a)
    println(b)
    println(c)

    val x: Option<String> = getRowFromDB(2)

    when (x) {
        is Some -> println(x.value)
        is None -> println("No value")
    }
}

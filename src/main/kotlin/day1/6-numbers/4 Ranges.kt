package day1.`6-numbers`

fun main() {
    val x = 1 .. 5
    //this is a range from 1 to 5

    x.forEach{println(it)}

    if (2 in x){
        print("2 is in the range x")
    }

    if (2 in 1 .. 100){
        print("2 is between 1 and 100")
    }
}
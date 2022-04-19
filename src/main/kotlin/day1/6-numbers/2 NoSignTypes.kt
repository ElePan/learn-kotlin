package day1.`6-numbers`


fun main() {
    //U from Unsigned
    val a: UByte = 12u //from 0 to 255
    val b: UShort = 25u //from 0 to 65535
    val c: UInt = 200U //from 0 to 2^32 -1
    val d: ULong = 22U //from 0 to 2^64 -1

    //Not recommended using it if not needed (still in beta)

    12.toUInt()
    //there are methods to pass from "normal" to unsigned ones
    12u.toInt()
    //and vice versa

    println(14u - 13u)
    //println(14 - 13u) not compiling

    println(12u - 13u)
    //arrives to ULong max size and works from it
}
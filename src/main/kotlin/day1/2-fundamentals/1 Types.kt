package day1.`2-fundamentals`

fun main() {
    //Any is the "father" of all types in kotlin, like an Object
    var x: Any = 111
    var y: Any = "adfgt"

    println(x)
    println(y)

    //Numeric
    var a: Byte = 1 //8 bits, -128 +127
    var b: Short = 1 //16 bits, -32768 +32767
    var c: Int = 1 //32 bits, -2^31 +(2^31)-1
    //Default numeric type is integer, so c and d are equals
    var d = 1
    var e: Long = 1 //64 bits
    var f = 1L //64 bits
    // the L means long, so e and f are equals

    var g: Float = 1.1F //32 bits
    var h = 1.1F
    var i: Double = 1.1 //64 bit

    var l: String = "hola"
    var m= "hola"

    var n: Char = 'n'
    var o = 'n'

    var p: Boolean = true
    var q = false

    //Arrays
    var r: Array<Int> = arrayOf(1,2,3)
}

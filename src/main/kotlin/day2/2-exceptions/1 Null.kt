package day2.`2-exceptions`

fun main() {
    //the ? means the object can be nullable
    var a: String? = null
    var c: String? = "not null"
    var b: String = "not nullable string"

    var x: String
    if (a != null){
        x = a
    } else {
        x = "default string"
    }

    if (b != null){
        println(b.length)
        // you can't do length of null, so you can do it only here (after the check, you are sure string is not null)
    }

    //Elvis check
    println(b?.length)
    //if not null print the length else print the value of b (= null)

    val list: List<String?> = listOf("pc", null, "mouse")
    for (item in list){
        item?.let { println(it.length) }
        //in this case we check not null, and later we do the print of not null length
    }

    val elvis = a?.length ?: ""
    println(elvis)

    println("!! b ${b!!.length}")
}

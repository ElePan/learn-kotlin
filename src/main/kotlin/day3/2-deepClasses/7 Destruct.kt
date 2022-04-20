package day3.`2-deepClasses`

data class Example(val name: String, val legs: Int)

fun main() {
    val e = Example("table", 4)

    val (val1, val2) = e
    //values name and legs are set with 1st and 2nd values of object e -> val1 is name and val2 is legs
    println("val1 is $val1, val2 is $val2")

    val(_, useful) = e
    //with underscore I indicate that this value is not needed, no assign is done for name in this case
    println("useful is $useful")

    /*
    I need in the parenthesis one variable (or underscore) for each field of the object.\
    In case of object Example: 2 fields (name and legs), so if I want to assign with destructurization I need two values:
    val (val1, val2) = object
     */

}
package day3.`6-kotlinOptions`

fun main() {
    val l = listOf("1", "")
    setOf(1,2,3).forEach{ println(it) } //order does not matter
    mapOf(1 to "one", 2 to "two") //key-value data

    arrayListOf(1, 2, 3)
    linkedSetOf(1, 2, 3)
    linkedMapOf(1 to "one", 2 to "two")

    l.map { x -> x.length.toString() }
    l.map { it.length.toString() }
    //both maps are equals

    l.filter { !it.isEmpty() }
    l.filterNot { it.isEmpty() }
    //both filters are equals

    l.any {it.length > 5} //true if at least one element match the condition
    l.all {it.length > 5} //true if all elements match the condition
    l.none {it.length > 5} //true if no element match the condition

    l.forEach { println(it) } //loop all elements of the list
    l.count() //return the number of elements in the list
    l.size //same but with a property
    l.sorted() //to order a list
    l.sortedDescending()

    l.find { it == "Hey" } //return only first element matching the condition
    l.firstOrNull { it == "Hey" } //return only first element matching the condition or null
    l.findLast { it == "Hey" } //return only last element matching the condition
}

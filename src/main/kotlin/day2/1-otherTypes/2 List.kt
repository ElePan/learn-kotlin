package day2.`1-otherTypes`

fun main() {

    val list = listOf(1, 2, 3, 15, 15)
    //No imports needed, already in the core

    val listEmpty: List<Int> = listOf()
    val listEmpty2= listOf<Int>()
    //to specify the type is needed for empty lists, as compiler can infer it

    //Access a list
    println("list[0]: ${list[0]}")
    println("list.get(1): ${list.get(1)}")
    println("list.elementAt(2): ${list.elementAt(2)}")
    //if the index not exist we have an out-of-bounds exception

    println("listEmpty.elementAtOrElse: ${listEmpty.elementAtOrElse(0) {-1}}")
    println("listEmpty2.elementAtOrNull: ${listEmpty2.elementAtOrNull(3)}")
   // println("listEmpty.elementAtOrElse: ${listEmpty.elementAtOrElse(0,1)}") TODO check  default value

    println(list.size)
    println(list.sum()) //sum of element values
    println(list.indexOf(15)) // it is 3 as indexes start from 0, should take the FIRST occurrence
    println(list.lastIndexOf(15)) // it is 4, should take LAST occurrence

    //OPERATIONS

    //Add
    val ml = mutableListOf(1, 5, 7)
    ml.add(10)
    ml.addAll(mutableListOf(12, 15))

    ml += 18

    //plus operation do not modify ml, you should save the result in a variable
    ml.plus(20)
    ml.plus(listOf(22, 24))

    ml.plusAssign(20) //plus assign return a new arraylist and also save in ml
    ml.add(20)
    println(ml)

    //Remove
    ml.remove(10) //remove the first occurrence of the value
    ml.removeAll(listOf(20)) //remove all occurrences of the value
    ml.removeAt(4) //remove by index

    ml.minus(1) //minus operation do not modify ml, you should save the result in a variable
    ml.minusAssign(1) //minus assign return a new arraylist and also save in ml

    ml-=18
    ml-=18 //if there is not this value just do nothing

    println(ml)

    //print the list
    ml.forEach{ x -> println(x) }
    ml.forEach{ println(it) }
}
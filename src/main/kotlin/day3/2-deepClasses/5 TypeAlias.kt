package day3.`2-deepClasses`

fun f(): Map<String, Map<String, List<Map<String,Long>>>>? = null

typealias LongStoryShort = Map<String, Map<String, List<Map<String,Long>>>>?

fun sameF(): LongStoryShort = null
//f ans sameF are the same function, the alias is useful to make it readable

fun main() {
    val a: LongStoryShort = null

    println(f()); println(sameF()); println(a)

}
package day3.`7-asynchrony`

import java.util.concurrent.CompletableFuture

fun main() {
    fun giveFuture(): CompletableFuture<Int> {
        val f = CompletableFuture.supplyAsync {
            //code
            Thread.sleep(2000)
            12 //this is the return
        }
        return f
    }

    val future = giveFuture()
    val rs = future.get()
    println(rs)
    //This is blocking, if I have no result I will not follow with the code

    println("Faster") //It is faster than rs result, but wait for previous print to be executed

    future.thenApply { println("Complete $it") }
}
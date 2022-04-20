package day2.`2-exceptions`

import java.io.IOException

/*
Java
Checked exceptions: you mast catch it
Unchecked exceptions: you can pass the user the catch

Kotlin
never mandatory to catch exception
*/

fun main() {
    //catch an exception
    try {
        //launch an exception
        throw Exception("Ehy")
    } catch (e: Exception) {
        println("Caught an exception! ${e.message}")
    } catch (e: Throwable) { //with Throwable you catch all exception, "father" of all exceptions
        println("Caught an exception! ${e.message}")
    } finally {
        //space to release resources (database connection etc)
    }

    fun fail(): Nothing {
        //Nothing means: return void or exception
        throw IOException("I'm an exception")
    }

    val x = try { fail() } catch (e: Exception) { -1 }
    //inline try catch
    println(x)

    //you could give a not caught exception with this line
    @kotlin.jvm.Throws(IOException::class)
    fun takeCare(): Nothing = run { fail() }

 }
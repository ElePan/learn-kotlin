package day3.`2-deepClasses`

import kotlin.reflect.full.declaredMemberFunctions

//you need in build gradle: implementation("org.jetbrains.kotlin:kotlin-reflect:1.6.20") or similar

@MyCustomApp
class Dog

fun main() {
    val a = listOf<String>()

    //Reflection is used to see class data. It is quite bad for performance, not recommended if not needed.

    println(a::class.simpleName)
    //a::class allow us to see all data of a's class

    for (mf in a::class.declaredMemberFunctions){
        println(mf)
    }

    val d = Dog()

    //I can use reflection also to see annotations
    d::class.annotations.forEach{
        println(it)

        if(it is MyCustomApp){
            println("it is my custom app")
        }
    }

}
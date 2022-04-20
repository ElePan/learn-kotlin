package day3.`2-deepClasses`

//Usually there is a file with all the annotation, I can use them in whole project (import is needed)

@Repeatable
@MustBeDocumented //you should add to the documentation this annotation
annotation class MyCustomApp

@Target(AnnotationTarget.ANNOTATION_CLASS) //this means it is only for classes
@Retention(AnnotationRetention.SOURCE) //generally works with scopes
annotation class Special

@MyCustomApp
class Cat

fun main() {
    val c = Cat()
}
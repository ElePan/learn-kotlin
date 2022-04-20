package day2.`4-objectOriented`

//Top level: default scope is public
private var ten = 10
//scope private restrict visibility to the file. Not visible in a test file.

private class Cat()

private fun hello() {
    println("Hello $ten")
}

/* SCOPES
Internal = visible in the module
Private = visible in the file
Protected = visible in the package (for unit test for example)
Public = visible everywhere
*/

fun  main() {
    hello()
}
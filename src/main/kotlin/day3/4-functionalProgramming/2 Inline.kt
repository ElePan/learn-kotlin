package day3.`4-functionalProgramming`

fun myFun (str: String, myCall: (String) -> Unit){
    myCall(str)
}

//For a better performance (execution time) the compiler can do it inline
inline fun myFunInline (str: String, myCall: (String) -> Unit){
    myCall(str)
}

fun main() {
    myFun("Ohana", ::println)
    myFunInline("Family", ::println)
    //using the "inline" the compiler "move" the code of the fun where the println
}
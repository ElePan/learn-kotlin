package day2.`3-FlowControl`

fun main() {
    val a = 12
    val b = 32
    var max = 0

    if (a < b){
        max = b
    } else {
        max = a
    }

    if (a < b)
        max = b
    else
        max = a
    //only one line, without brackets

    max = if (a < b) b else a

    max = if (a < b) {
        b // return in not needed
    }
    else {
        a //you can d several actions in the brackets
    }

}

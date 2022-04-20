package day3.`5-arrow`

import arrow.core.Either

data class Demo(var value: Int)

fun validate(d: Demo): Either<Error, Demo> {
    if (d.value < 5) {
        return Either.Left(Error.BAD_LENGHT)
    } else if (d.value % 2 == 0){
        return Either.Left(Error.IS_ODD)
    }
    return Either.Right(d)
}

fun main() {
    val dm5 = Demo(5)
    val a: Either<Error, Demo> = validate(dm5)
    println(a)

    val dm2 = Demo(2)
    val b: Either<Error, Demo> = validate(dm2)
    println(b)

    val dm10 = Demo(10)
    val c: Either<Error, Demo> = validate(dm10)
    println(c)
}
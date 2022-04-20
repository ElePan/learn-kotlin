package day2.`3-objectOriented`

//top level functions:all package can see them

fun main() {
    //only inside the main we can see them
    fun a() {}

    fun voidFun(): Unit {} //without return

    fun getInt(): Int {return 1}

    fun getInputInt(x: Int): Int {return x}

    fun inlineFun(x: Int) = 1 //inline fun, with =, no return type needed
    fun inlineFunWithType(x: Int): Int = 1 //no return type needed... but you can add it anyway

    fun inlineFun(x: Int, y: Int) = 12

    fun doubleInput(
        x: Int,
        y: Int, //trailing commas, recommended!! Use comma also in last param
    ) = 12

    fun getWithDefault(x: Int = 12): Int {return x} //if not input will use 12 as default

    println(getWithDefault())  //will return 12
    println(getWithDefault(5))  //will return 5

    //Take care! Default values must be at the end
    fun getWithDefaultTwoParams(x: Int = 12, y: Int): Int {return x}

    /*How to call it with only y?
    getWithDefaultTwoParams(3) 3 is detected as x
    */
    getWithDefaultTwoParams(y = 3)
    //you can specify the param name, but not totally recommended

    //VARGS (use variable number of args)
    fun vargFun (vararg x: Int) {
        println(x.size)
    }

    println("Variable number of args")
    println(vargFun())
    println(vargFun(3))
    println(vargFun(3, 5))

    fun fixedAndVargFun (y: String, vararg x: Int) { println(x.size) }

    println(fixedAndVargFun(""))
    println(fixedAndVargFun("",3))
    println(fixedAndVargFun("",3, 5))
}

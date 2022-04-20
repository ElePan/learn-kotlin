package day3.`1-deepInterfaces`

interface Api {
    fun doGet()
    fun doPost()
}

class RestApi(): Api {
    override fun doGet() {
        println("A get")
    }

    override fun doPost() {
        println("A post")
    }
}

class ApiManager(private val restApi: RestApi = RestApi()): Api by restApi {}
// rest api (the variable) will implement it, we are delegating

fun main() {
    val x = ApiManager()
    x.doGet()
    x.doPost()
}

package day3.`2-deepClasses`

class Airport(private val code: String) {

    //An inner class is created inside another one and can access variables of "father class"
    open class Plane {
        fun contact(airport: Airport) = "Contact with ${airport.code}"
    }

    private class PrivatePlane: Plane()
    fun privatePlane(): Plane = PrivatePlane()
}

fun main() {
    val mad = Airport("MAD")
    val plane = Airport.Plane()
    //Plane has no access to Airport variables

    plane.contact(mad)
    //for this reason we need to pass the airport as input
    mad.privatePlane()
}
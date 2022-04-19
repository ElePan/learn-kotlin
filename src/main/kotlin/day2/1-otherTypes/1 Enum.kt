package day2.`1-otherTypes`

enum class CardinalPoints {
    North, South, East, West
}

enum class Directions(val address: String) {
    North("N"), South("S"), East("E"), West("W")
}


fun main() {
    val north: CardinalPoints = CardinalPoints.North

    if (CardinalPoints.North == north){
        println("It's north")
    }

    println(CardinalPoints.South)
    println(Directions.East.address)
    println(Directions.valueOf("West"))
    //println(Directions.valueOf("W")) not compiling

    val south: Directions = Directions.South
    println(south.address)

}

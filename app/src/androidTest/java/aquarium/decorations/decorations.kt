package aquarium.decorations

fun main(args: Array<String>) {
    makeDecorations()
}

fun makeDecorations(){
    val d1 = Decorations("granite")
    println(d1)

    val d2 = Decorations("Slate")
    println(d2)

    val d3 = Decorations("Slate")
    println(d3)

    println(d1.equals(d2))
    println(d3.equals(d2))

    val d4: Decorations = d3.copy()
    println(d3)
    println(d4)

    val d5 = Decorations2("crystal", "wood", "driver")
    println(d5)

    val (rock:String, wood:String, driver:String) = d5
    println(rock)
    println(wood)
    println(driver)

}

data class Decorations(val rocks: String) {}

data class Decorations2(val rocks: String, val wood: String, val driver: String){}
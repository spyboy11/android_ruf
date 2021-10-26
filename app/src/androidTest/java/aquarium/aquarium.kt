package aquarium



import java.lang.Math.PI

open class Aquarium (var length: Int = 100, var width: Int = 20, var height: Int = 40){
    open var volume: Int
        get() = width*height*length/1000
        set(value){height = (value * 1000) / (width * length)}

    open var water = volume * 0.9

    constructor(numberoffish: Int): this() {
        val water: Int = numberoffish * 2000
        val tank: Double = water + water * 0.1
        height = (tank / (length * width)).toInt()
    }
}

class towertank(): Aquarium(){
    override var water = volume * 0.8

    override var volume: Int
        get() = (width * height * length / 1000 * PI).toInt()
        set(value){
            height = (value * 1000) / (width * length)
        }
}

//abstract class declaration
abstract class aquariumfish{
    abstract val color: String
}

class shark: aquariumfish(), fishaction{
    override val color = "gray"
    override fun eat() {
        println("hunt and eat fish")
    }
}

class plecostomus: aquariumfish(), fishaction{
    override val color = "gold"
    override fun eat(){
        println("much on algae")
    }
}

//addming interface
interface fishaction{
    fun eat()
}

//implementations
interface aquariumaction{
    fun eat()
    fun jumn()
    fun clean()
    fun catchfish()
    fun swim() {
        println("Swim")
    }
}

interface fishAction{
    fun eat()
}

abstract class aquriumfish: fishAction{
    abstract val  color: String
    override  fun eat() = println("yum")
}


//exploring composition
fun main(args: Array<String>){
    delegate()
}

fun delegate(){
    val pleco = plecostomus()
    println("fish has color ${pleco.color}")
    pleco.eat()
}

interface FishAction{
    fun eat()
}

interface Fishcolor{
    val color: String
}

//class Plecostomus(fishcolor: Fishcolor = Goldcolor):
    //FishAction by printingFishAction("a lot of algae"),
    //Fishcolor by fishcolor

class Goldcolor: Fishcolor{
    override val color = "gold"
}

object RedColor: Fishcolor{
    override val color = "red"
}

class printingFishAction(val food: String): FishAction{
    override fun eat() {
        println(food)
    }
}
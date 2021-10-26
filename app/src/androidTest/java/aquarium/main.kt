package aquarium

fun main(args: Array<String>){
    //buildaqurium()
    //makefish()
    /*val repeatFun: String.(Int)-> String = {times -> this.repeat(times)}
    val twoParameters:(String, Int) -> String = repeatFun

    fun runTransformation(f:(String, Int) -> String): String{
        return f("hello",3)
    }
    val result = runTransformation(repeatFun)

    println("result = $result")*/
    val stringPlus: (String, String) -> String = String::plus
    val intPlus: Int.(Int) -> Int = Int::plus

    println(stringPlus.invoke("<-", "->"))
    println(stringPlus("Hello, ", "world!"))

    println(intPlus.invoke(1, 1))
    println(intPlus(1, 2))
    println(2.intPlus(3))
}

/*fun buildaqurium(){
    val myAquarium = Aquarium()

    println("Length: ${myAquarium.length}"+
            "Width: ${myAquarium.width}"+
            "Height: ${myAquarium.height}")

    myAquarium.height = 80

    println("Height: ${myAquarium.height} cm")

    println("Volume: ${myAquarium.volume} liters")

    val smallAquarium = Aquarium(length = 20, width = 15, height = 30)
    println("Small Aquarium: ${smallAquarium.volume} liters")

    val myAquarium2 = Aquarium(numberoffish = 9)

    println("Small Aquarium 2: ${myAquarium2.volume} liters with"+
            "\n\t\t\t\tlength ${myAquarium2.length}"+
            "\n\t\t\t\twidth ${myAquarium2.width}"+
            "\n\t\t\t\theight ${myAquarium2.height}")
}

fun feedfish(fish: fishaction){
    //make some food them
    fish.eat()
}

fun makefish(){
    val shark = shark()
    val pleco = plecostomus()

    println("Shark: ${shark.color} \n Plecostomus: ${pleco.color}")

    shark.eat()
    pleco.eat()
}*/
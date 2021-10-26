package aquarium

class fish(val firendly: Boolean = true, volumeneeded: Int){
    val size: Int

    init {
        println("first init block")
    }

    constructor(): this(true, 9){
        println("running secondary constructor")
    }

    init {
        if(firendly){
            size = volumeneeded
        } else {
            size = volumeneeded * 2
        }
    }

    init {
        println("Constructed fish of size $volumeneeded final size ${this.size}")
    }

    init {
        println("last init block")
    }
}

fun  makedefaultfish() = fish(true,50)

fun fishexample(){
    val fish = fish(true, 20)
    println("Is the fish firendly? ${fish.firendly}. It need volume ${fish.size}")
}
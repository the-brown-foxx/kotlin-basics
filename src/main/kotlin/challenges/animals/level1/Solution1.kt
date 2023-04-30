package challenges.animals.level1

fun main() {
    println("Number of Animals: ")
    val numberOfAnimals : Int = readln().toInt()
    for(i in 1..numberOfAnimals){

        println("Animal $i of $numberOfAnimals")
        println("Enter Name: ")
        val name : String = readln()
        println("CAT or DOG: ")
        val catDog : String = readln()

        if(catDog != catDog.uppercase()){
            println("Use uppercase letters only!")
        }
        else{
            animalSound(name,catDog)
        }

    }
}

fun animalSound(name : String, animal: String){

    when(animal){
        "CAT" -> println("$name, meowed")
        "DOG" -> println("$name, barked")
        else ->println("$name, talked")
    }
}
package challenges.animals.level3

import kotlin.arrayOf

// Starter code
// Uncomment before starting
// Output could vary from inherent randomness


fun main() {
    println(getRandomCatSound()) // meowed
    println(getRandomDogSound()) // barked
    makeAnimalSound("cat", "Me-Mow") // Me-Mow hissed
    makeAnimalSound("dog", "Jake") // Jake growled
    makeAnimalSound("cow", "Herb") // Herb talked
    makeAnimalSound(name = "Ert") // Ert talked
}

fun makeAnimalSound(animal : String = "", name: String = "") {
    when(animal){
        "cat" -> println("$name, ${getRandomCatSound()}")
        "dog" -> println("$name, ${getRandomDogSound()}")
        else -> println("$name , talked")
    }
}

fun getRandomDogSound() = listOf("barked", "whimpered", "Howled" ).random()

fun getRandomCatSound() = listOf("meowed", "purred", "yowled", "Hissed").random()



 
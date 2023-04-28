package challenges.animals.level3

// Output could vary from inherent randomness
fun main() {
    println(getRandomCatSound()) // meowed
    println(getRandomDogSound()) // barked
    makeAnimalSound("cat", "Me-Mow") // Me-Mow hissed
    makeAnimalSound("dog", "Jake") // Jake growled
    makeAnimalSound("cow", "Herb") // Herb talked
    makeAnimalSound(name = "Ert") // Ert talked
}

fun getRandomCatSound() = listOf("meowed", "hissed", "purred").random()

fun getRandomDogSound() = listOf("barked", "growled").random()

fun makeAnimalSound(animal: String = "", name: String) {
    println(
        "$name ${
            when (animal) {
                "cat" -> getRandomCatSound()
                "dog" -> getRandomDogSound()
                else -> "talked"
            }
        }"
    )
}
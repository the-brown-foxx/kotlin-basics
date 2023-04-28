package challenges.animals.level1

fun main() {
    print("Number of animals: ")
    val animalCount = readln().toInt()

    for (i in 1..animalCount) {
        println("\nAnimal $i of $animalCount")

        print("Cat or dog: ")
        val animal = readln().lowercase()

        print("Name: ")
        val name = readln()

        when (animal) {
            "cat" -> println("$name meowed")
            "dog" -> println("$name barked")
            else -> println("$name talked")
        }
    }
}
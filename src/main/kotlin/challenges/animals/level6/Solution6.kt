package challenges.animals.level6
fun main() {
    val animals = listOf(
        Animal("Herb"),
        Animal("Me-Mow"),
        Animal("Jake"),
        Animal("Cake"),
        Animal("Shelby"),
        Animal("Baxter"),
    )
    animals.cull { animal -> animal.name != "Herb" && coinFlip() == CoinFace.Heads }
    println(animals)
}

data class Animal(val name: String, var isAlive: Boolean = true)

@Suppress("unused")
enum class CoinFace { Heads, Tails }

fun coinFlip() = CoinFace.values().random()

fun List<Animal>.cull(predicate: (Animal) -> Boolean) {
    for (animal in this) {
        if (predicate(animal)) {
            animal.isAlive = false
        }
    }
}

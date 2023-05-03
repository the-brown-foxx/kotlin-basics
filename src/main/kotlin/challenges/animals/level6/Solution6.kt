package challenges.animals.level6

import kotlin.random.Random

fun main() {
    // Test coinFlip
    var heads = 0
    val flips = 1_000_000
    repeat(flips) {
        if (coinFlip(headsProbability = 0.3f) == CoinFace.Heads) heads++
    }

    println(heads.toDouble() / flips.toDouble())
    val animals = listOf(
        Animal("Herb"),
        Animal("Me-Mow"),
        Animal("Jake"),
        Animal("Cake"),
        Animal("Shelby"),
        Animal("Baxter"),
    )
    animals.cull { animal -> animal.name != "Herb" && coinFlip(0.75f) == CoinFace.Heads }
    println(animals)
}

data class Animal(val name: String, var isAlive: Boolean = true)

@Suppress("unused")
enum class CoinFace { Heads, Tails }

fun coinFlip(headsProbability: Float = 1f): CoinFace {
    val actualHeadsProbability = if (headsProbability < 0) 0f else if (headsProbability > 1) 1f else headsProbability
    val randomFloat = Random.nextDouble(0.0, 1.0).toFloat()
    return if (actualHeadsProbability == 1f || randomFloat < actualHeadsProbability) CoinFace.Heads else CoinFace.Tails
}

fun List<Animal>.cull(predicate: (Animal) -> Boolean) {
    for (animal in this) {
        if (predicate(animal)) {
            animal.isAlive = false
        }
    }
}

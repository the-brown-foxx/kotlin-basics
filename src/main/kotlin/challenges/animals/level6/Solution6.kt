package challenges.animals.level6

fun main() {
    // Test coinFlip
//    var heads = 0
//    val flips = 1_000_000
//    repeat(flips) {
//        if (coinFlip(headsProbability = 0.3f) == CoinFace.Heads) heads++
//    }
//    println(heads.toDouble() / flips.toDouble())

    val animals = listOf(
        Animal("Herb"),
        Animal("Me-Mow"),
        Animal("Jake"),
        Animal("Cake"),
        Animal("Shelby"),
        Animal("Baxter"),
    )
    // TODO: Cull your animals here
    println(animals)
}

data class Animal(val name: String, var isAlive: Boolean = true)
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
    // TODO: Do the culling here
    println(animals)
}

data class Animal(val name: String, var isAlive: Boolean = true)

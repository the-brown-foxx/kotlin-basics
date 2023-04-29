package challenges.animals.level4

fun main() {
    val cat = AnimalSpecies("cat", listOf("meowed", "hissed"))
    val dog = AnimalSpecies("dog", listOf("barked", "growled"))

    val meMow = Animal(cat, "Me-Mow")
    val cake = Animal(cat, "Cake")
    val jake = Animal(dog, "Jake")
    val herb = Animal(dog, "Herb")

    meMow.makeSound()
    cake.makeSound()
    jake.makeSound()
    herb.makeSound()

    herb.kill()
    herb.makeSound()
    herb.makeSound()
}

class AnimalSpecies(
    val name: String,
    val sounds: List<String>,
)

@Suppress("MemberVisibilityCanBePrivate")
class Animal(
    val species: AnimalSpecies,
    val name: String,
    isAlive: Boolean = true,
) {
    var isAlive = isAlive
        private set

    fun makeSound() {
        if (isAlive) {
            val sound = species.sounds.random()
            println("$name $sound")
        } else {
            println("$name is dead")
        }
    }

    fun kill() {
        if (isAlive) {
            isAlive = false
            println("Your ${species.name} $name died")
        } else {
            println("$name is already dead")
        }
    }
}
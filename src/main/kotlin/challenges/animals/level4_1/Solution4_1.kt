package challenges.animals.level4_1

fun main() {
    val meMow = Cat("Me-Mow")
    println(meMow.lives)
    println(meMow.isAlive)
    meMow.meow()
    meMow.purr()
    repeat(9) {
        meMow.kill()
        println(meMow.lives)
        println(meMow.isAlive)
        meMow.meow()
        meMow.purr()
    }
    val herb = ImmortalCow("Herb")
    println(herb.isAlive)
    herb.kill()
    println(herb.isAlive)
}

open class Animal(val species: String, open val name: String) {
    open var isAlive = true
        protected set

    open fun kill() {
        if (isAlive) {
            isAlive = false
            println("Your $species $name died")
        } else {
            println("$name is already dead")
        }
    }

    override fun toString() = "Animal(species = $species, name = $name, isAlive = $isAlive)"
}

class Cat(name: String) : Animal(species = "Cat", name = name) {
    var lives: Int = 9
        private set

    override var isAlive: Boolean
        get() = lives > 0
        set(newIsAlive) {
            if (isAlive) {
                if (!newIsAlive) {
                    lives = 0
                }
            } else {
                if (newIsAlive) {
                    lives = 1
                }
            }
        }

    fun meow() {
        println(if (isAlive) "$name meowed" else "$name is dead")
    }

    fun purr() {
        println(if (isAlive) "$name purred" else "$name is dead")
    }

    override fun kill() {
        if (isAlive) {
            lives--
            println(
                if (isAlive) "$name died once; $name has $lives lives left"
                else "Your cat $name died"
            )
        } else {
            println("$name is already dead")
        }
    }
}

class ImmortalCow(name: String) : Animal(species = "Immortal Cow", name = name) {
    override var isAlive: Boolean = true
        get() = super.isAlive
        set(_) { field = true }
    override fun kill() {
        println("$name is immortal")
    }
}
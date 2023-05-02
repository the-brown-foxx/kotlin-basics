package challenges.animals.level4

class AnimalSpecies(val name: String, val sounds : List<String>)

class Animal(private val species : AnimalSpecies, private val name: String, private var isAlive : Boolean = true){

   fun makeSound() {
       if(isAlive) {
           println("$name ,${species.sounds.random()}")
       }
       else{
           println("$name is already dead")
       }
   }

     fun kill(){
        if(!isAlive){
            println("$name is already dead")
        }
        else{
            isAlive = false;
            println("Your ${species.name} $name died")
        }

    }

}
fun main(){

    val cat = AnimalSpecies("Cat", listOf("meowed","purred","hissed"))
    val dog  = AnimalSpecies("Dog", listOf("barked","whimpered","howled"))

    val animal1 = Animal(cat,"Me-mow",true)
    val animal2 = Animal(dog,"Jake",true)
    val animal3 = Animal(dog,"Typhon",false)

    animal1.kill()
    animal3.kill()
    animal1.makeSound()
    animal2.makeSound()
    animal3.makeSound()

}
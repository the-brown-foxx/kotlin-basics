# Animals Challenge

## Level 4

Make an abstract class `AnimalSpecies` with these properties:
- `name: String` name of the species
- `sounds: List<String>` sounds that the species makes in past-tense

Make another class `Animal` with these properties:
- `species: AnimalSpecies`
- `name: String` name of that animal. Example: "Me-Mow"
- `isAlive: Boolean` `true` if the animal is still alive

Add these methods to your `Animal` class:
- `makeSound` 
  - will print `[animal name] [a random sound of the species]` 
    - Example: `Me-Mow meowed`
  - will print `[animal name] is dead` instead the animal is dead
- `kill`
    - will kill the animal
  - will print `Your [animal species] [animal name] died` 
    - Example: `Your cat Me-Mow died`
  - will print `[animal name] is dead` if the animal is already dead
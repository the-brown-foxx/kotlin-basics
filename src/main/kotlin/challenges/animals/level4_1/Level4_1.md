# Animals Challenge

## Level 4.1

Make an open class `Animal` with these properties:
- `species: String`
- `name: String`
- `isAlive: Boolean` not part of the constructor; should default to true

Add these methods to your `Animal` class:
- `kill`
  - will kill the animal
  - will print `Your [species] [name] died`
    - Example: `Your cat Me-Mow died`
  - will print `[name] is already dead` if the animal is already dead
- `toString`
  - override the default `toString` method to print `Animal(species = [species], name = [name], isAlive = [isAlive])`
    - Example: `Animal(species = Cat, name = Me-Mow, isAlive = true)`

Make a subclass of `Animal` named `Cat` with these properties:
- `name: String`
- `lives: Int` not part of the constructor; should default to 9
- Initialize `Animal.species` with `"Cat"`
- override `isAlive` to be `true` if the cat has more than 0 lives, else `false`

Add these methods to `Cat`:
- `meow` will print `[name] meowed`
  - will print `[name] is dead` instead if the cat is dead
- `purr` will print `[name] purred`
  - will print `[name] is dead` instead if the cat is dead
- override `kill` to subtract 1 from the cat's lives
  - print `[name] died once; [name] has [lives] lives left`
  - if the cat lost its last life, print `Your cat [name] died`
  - if the cat is already dead, print `[name] is already dead`

Make a subclass of `Animal` named `Immortal Cow`:
- Add the property `name: String`
- override `kill` to print `[name] is immortal` and not change `isAlive`
- override the setter of `isAlive` to be permanently true
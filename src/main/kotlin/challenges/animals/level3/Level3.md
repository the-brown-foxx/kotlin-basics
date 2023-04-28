# Animals Challenge

## Level 3

**Starter code**
```kotlin
// Output could vary from inherent randomness
fun main() {
    println(getRandomCatSound()) // meowed
    println(getRandomDogSound()) // barked
    makeAnimalSound("cat", "Me-Mow") // Me-Mow hissed
    makeAnimalSound("dog", "Jake") // Jake growled
    makeAnimalSound("cow", "Herb") // Herb talked
    makeAnimalSound(name = "Ert") // Ert talked
}
```

Write a function `getRandomCatSound` that will return a random cat sound in past-tense (e.g. meowed).

Write a function `getRandomDogSound` that will return a random dog sound in past-tense (e.g. barked).

Write a function `getRandomSound` that will return a random sound in past-tense (e.g. roared).

> **Note:** There should be no intersect between the sounds returned by the three functions.

> **Hint:** You will use Kotlin's method `random` for collections.

Write a function `makeAnimalSound`. It must have these parameters:
- `animal: String`
- `name: String`

`makeAnimalSound` should print `[name] [random cat/dog sound]` depending on the value of `animal`. It should print `[name] talked` if `animal` is not a cat, a dog, or if the function call to `makeAnimalSound` did not provide an animal. `animal` should be case-insensitive.

Use `makeRandomCatSound` and `makeRandomDogSound` inside your `makeAnimalSound` function.

> **Bonus:** Use single-expression functions wherever possible.
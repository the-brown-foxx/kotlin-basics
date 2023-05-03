# Animal Challenge

## Level 6

> Use the provided starter code

You have bred too many animals for your stupid Kotlin project. You have to cull them. You decided to flip a coin for each animal to decide their fate.

Write an enum class `CoinFace` to represent the coin faces: `Heads` and `Tails`.

Write a `coinFlip` function that will return a random `CoinFace`. `coinFlip` should have a parameter `headsProbability` that will determine the likelihood of getting heads.

Write an extension function `cull` for the data type `List<Animal>`. The function must accept a predicate lambda.
- The predicate must return a `Boolean`
- If the predicate is `true`, kill the animal
- Allow the caller of the function to use the predicate to decide which animal they will kill

In the main function, you will see a list of animals. Call the `cull` function on the animals and use your `coinFlip` function to decide their fate: tails means they are safe (for now); heads means off with their head. Use a `headsProbability` of 75%.

However, save your favorite animal, "Herb". Do not let a coin flip end your relationship.
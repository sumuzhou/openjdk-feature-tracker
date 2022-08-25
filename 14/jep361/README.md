# JEP 361: Switch Expressions

> [Link](https://openjdk.org/jeps/361)

The `switch` keyword is used in a statement traditionally, which means the sole purpose of it is controlling the flow. The statement-oriented nature of it brings some troubles for us if we want to leverage it for value assignment:

- It's verbose, we must first declare a global variable and then assign a value to it in each branch.
- It's error-prone, it's too easy for developers to forget breaking the branch, and there is no mechanism to guarantee the exhaustiveness of branches.

So the **Switch Expressions** feature is introduced into JDK to help solve these problems. We can write conditional value assignment logic much more easily with it, and benefit from the related pattern match potentials in the future.

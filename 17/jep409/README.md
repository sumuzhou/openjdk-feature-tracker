# JEP 409: Sealed Classes

> [Link](https://openjdk.org/jeps/409)

In Java language, we can use enum to model a situation where a type can only have limited values. It's convenient and carries domain knowledge by the definition.

But sometimes, we want to constrain the **SUB TYPE** of one particular type and prevent it from extending arbitrarily. We can have the following choices traditionally:

- Add the `final` keyword to the type so no type can extend it.
- Make the type `package-private` so only the types in the same package can extend it. But then this type is useless because it can't be read and used as the base abstraction from code outside of its package.
- Mark the constructor of the type to `non-public` which does not work with interfaces and is tricky.

None of the above solutions is satisfying and we need a way to trade off the code reusability and degrees of freedom, so here comes the `sealed` keyword.

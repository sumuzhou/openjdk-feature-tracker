# JEP 394: Pattern Matching for instanceof

> [Link](https://openjdk.org/jeps/394)

As a Java developer, I believe you have seen the following boilerplate code many times:

```java
if (obj instanceof String) {
    String s = (String) obj;    // grr...
    ...
}
```

The only solely purpose for this code is try to check the type of an object before actually use it. As our friend Joey said, there's gotta be a better way. And there is Kevin, the pattern match comes to rescue.
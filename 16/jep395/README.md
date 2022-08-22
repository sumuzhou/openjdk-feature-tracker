# JEP 395: Records

> [Link](https://openjdk.org/jeps/395)

Record classes are supposed to be data carriers, the ues of record in code can explicitly express the intention of the author. The values in record class are supposed to be immutable once created.

The downside of record classes is the binding of components with their accessors, for example the accessor of a component `afield` is always be `afield()`, it's a trade-off between the freedom and the concision.

Record classes are **NOT** the replacement of `POJO`.
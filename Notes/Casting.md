Casting a data type to another allows you to **convert** one similar type to another. Really, this is *only used for numbers* as you **can’t** cast an int to a boolean.

To cast one type to another, you’ll **specify the type** that you want to cast to in *parenthesis* in front of the variable that you are converting.

For example, look at the following:

```java
long a = 10393L;

int i = (int) a;
```

In the second statement, we've casted the variable a to an `int` type, and stored the value in a new variable labeled, `i`. To cast, you specify a datatype in parentheses in front of the variable that you're converting.

![[Upcasting vs. Downcastng]]
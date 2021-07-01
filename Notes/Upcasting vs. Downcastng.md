

There is an important distinction to be aware of when casting to a type that encompasses a larger range (upcasting) or to a type with a smaller range (downcasting).

When upcasting, you won’t have to worry about data loss, because you will have extra bits of information to store the number in. For example, when casting from a float to a double, you move from 32 bits to 64 bits.

When downcasting, however, you can potentially lose some data depending upon the range of the type that you’re casting to. For example, if you cast from an int to a byte, any number larger than 127 (8 bits, using two’s complement), will be truncated and you’ll lose some bits of information.
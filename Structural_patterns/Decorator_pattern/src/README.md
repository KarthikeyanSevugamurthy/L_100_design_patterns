## Decorator pattern
This project illustrates the Decorator Design Pattern using a custom input stream system inspired by Java I/O. It demonstrates how to wrap basic objects with additional behavior dynamically.



## Pattern Summary
Component: InputStream (interface)

ConcreteComponent: FileStream

Decorators: BufferedStream, EncryptedStream

Goal: Add behavior (like buffering, encryption) without modifying FileStream.


## How to Run

javac src/**/*.java
java -cp src Main



## Benefits
 - Behavior can be added without modifying existing code.
 - Flexible stacking of features.
 - Promotes reusability and composition.


## Sample Output

Raw File:
Reading data from file.

Buffered File:
Reading data from file.
Buffered reading enabled.

Buffered + Encrypted File:
Reading data from file.
Buffered reading enabled.
Decrypting data after reading.
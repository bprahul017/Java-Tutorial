# Java Learning Guide

This document provides a comprehensive overview of fundamental Java programming concepts, designed for beginners and intermediate learners. It covers essential topics to help you understand and apply Java effectively.

## Table of Contents
1. [Overview](#overview)
2. [Java Components](#java-components)
3. [Variables in Java](#variables-in-java)
4. [Java Math Class](#java-math-class)
5. [Conditional Statements & Operators](#conditional-statements--operators)
6. [Java Loops](#java-loops)
7. [Arrays in Java](#arrays-in-java)
8. [ArrayList in Java](#arraylist-in-java)
9. [Strings in Java](#strings-in-java)
10. [Wrapper Classes in Java](#wrapper-classes-in-java)
11. [Methods in Java](#methods-in-java)
12. [Final Keyword in Java](#final-keyword-in-java)
13. [Static in Java](#static-in-java)
14. [Java Variables – Local vs Global](#java-variables--local-vs-global)
15. [Java OOP Concepts](#java-oop-concepts)
16. [Java Access Modifiers](#java-access-modifiers)
17. [Interfaces in Java](#interfaces-in-java)
18. [Exception Handling](#exception-handling)
19. [Java File Handling](#java-file-handling)

## Overview
This guide covers the following key areas of Java programming:
- **Java Installation**: Setting up the Java Development Kit (JDK) and Java Runtime Environment (JRE).
- **Fundamental Syntax and Semantics**: Core programming constructs.
- **Strings, Arrays, and Lists**: Working with data structures.
- **File Handling and Statistics**: Processing CSV files and basic data analysis.
- **Object-Oriented Programming (OOP)**: Principles like inheritance, polymorphism, and encapsulation.
- **Advanced Topics**: Cryptography basics, sorting algorithms, and predictive text concepts.
- **Tools and Libraries**: Using Java libraries for practical applications.
- **Recommendation Systems**: Introduction to building simple recommenders.

## Java Components
- **JDK (Java Development Kit)**: Tools for developing, compiling, and debugging Java programs.
- **JRE (Java Runtime Environment)**: Environment for running Java applications.

## Variables in Java
### Primitive Data Types
| Type   | Size       | Range                              | Example         |
|--------|------------|------------------------------------|-----------------|
| `boolean` | 1 bit   | `true` or `false`                  | `true`          |
| `byte`    | 1 byte  | -128 to 127                        | `100`           |
| `short`   | 2 bytes | -32,768 to 32,767                  | `30000`         |
| `int`     | 4 bytes | ~ -2 billion to +2 billion         | `123456`        |
| `long`    | 8 bytes | ~ -9 quintillion to +9 quintillion | `123456789L`    |
| `float`   | 4 bytes | Fractional numbers (6-7 digits)    | `3.141592f`     |
| `double`  | 8 bytes | Fractional numbers (15 digits)     | `3.141592653589793` |
| `char`    | 2 bytes | Single character/Unicode           | `'A'`           |

### Reference Data Types
- **String**: Stores a sequence of characters, e.g., `"Hello World"`.
- **Key Differences**:
  - Primitives store data directly, are faster, and use less memory.
  - Reference types store memory addresses, support complex structures, and are more flexible.

### Variable Operations
- **Declaration**: `int x;` (reserves memory).
- **Assignment**: `x = 123;` (sets value).
- **Initialization**: `int x = 123;` (combines declaration and assignment).
- **Expressions**: Combine operands (e.g., `x`, `123`) and operators (e.g., `+`, `-`, `*`, `/`, `%`).

## Java Math Class
The `Math` class in the `java.lang` package provides methods for numeric operations:
- `Math.max(x, y)`: Returns the larger of two values.
- `Math.min(x, y)`: Returns the smaller of two values.
- `Math.abs(x)`: Returns the absolute value.
- `Math.sqrt(x)`: Returns the square root.
- `Math.pow(base, exponent)`: Returns `base` raised to `exponent`.
- `Math.round(x)`, `Math.floor(x)`, `Math.ceil(x)`: Rounding functions.
- `Math.random()`: Generates a random number between 0.0 (inclusive) and 1.0 (exclusive).
- Trigonometric functions: `Math.sin()`, `Math.cos()`, `Math.tan()`.

**Example**:
```java
double x = 3.14, y = -10;
System.out.println(Math.max(x, y)); // 3.14
System.out.println(Math.sqrt(16));   // 4.0
System.out.println(Math.random());   // Random number [0.0, 1.0)
```

## Conditional Statements & Operators
Conditional statements control program flow based on conditions:
- **if**: Executes if condition is true.
- **if...else**: Provides alternative execution path.
- **if...else if...else**: Tests multiple conditions.
- **Nested if**: Conditions within conditions.
- **switch**: Selects execution path based on variable value.
- **Ternary Operator (`?:`)**: Shorthand for `if...else`.
- **Logical Operators**: `&&` (AND), `||` (OR), `!` (NOT).
- **Relational Operators**: `==`, `!=`, `>`, `<`, `>=`, `<=`.
- **Control Flow Keywords**: `break`, `continue`, `return`.

**Example**:
```java
int num = 75;
if (num >= 90) {
    System.out.println("Grade A");
} else if (num >= 75) {
    System.out.println("Grade B"); // Outputs: Grade B
} else {
    System.out.println("Grade C");
}
```

## Java Loops
Loops execute code repeatedly:
- **for**: Known number of iterations.
  ```java
  for (int i = 1; i <= 5; i++) {
      System.out.println(i); // Outputs: 1 2 3 4 5
  }
  ```
- **while**: Unknown number of iterations.
- **do...while**: Executes at least once.
- **for-each**: Iterates over arrays/collections.
- **Nested Loops**: Loops within loops.
- **Control Statements**: `break`, `continue`, `return`.

## Arrays in Java
Arrays store elements of the same type in contiguous memory:
- **Declaration**: `int[] numbers;`
- **Initialization**: `int[] numbers = new int[5];` or `int[] primes = {2, 3, 5, 7, 11};`
- **Access**: `numbers[0]` (index starts at 0).
- **Length**: `numbers.length`.
- **Traversal**: Use `for` or `for-each` loops.
- **Multidimensional Arrays**: Arrays of arrays, e.g., `int[][] matrix = {{1, 2}, {3, 4}};`.
- **Operations**: Use `Arrays.stream()` for max, min, sum, average; `Arrays.toString()` for string conversion.

## ArrayList in Java
`ArrayList` is a dynamic, resizable array in `java.util`:
- Stores reference types (e.g., `Integer`, `String`).
- Common methods: `add()`, `get()`, `set()`, `remove()`, `size()`, `clear()`, `isEmpty()`.
- **Example**:
  ```java
  ArrayList<String> list = new ArrayList<>();
  list.add("Java");
  System.out.println(list.get(0)); // Outputs: Java
  ```

## Strings in Java
Strings represent sequences of characters and are immutable:
- **Creation**: `String s = "Hello";` (String pool) or `String s = new String("Hello");` (heap).
- **Methods**: `length()`, `charAt()`, `substring()`, `toUpperCase()`, `toLowerCase()`, `trim()`, `equals()`, `contains()`, `split()`, etc.
- **Concatenation**: Using `+` or `concat()`.
- **StringBuilder/StringBuffer**: Mutable alternatives for efficient string manipulation.

## Wrapper Classes in Java
Wrapper classes convert primitives to objects:
- Examples: `Integer` for `int`, `Double` for `double`.
- **Autoboxing**: `Integer obj = 5;` (primitive to object).
- **Unboxing**: `int x = obj;` (object to primitive).
- Used in collections like `ArrayList`.

## Methods in Java
Methods are reusable code blocks:
- **Syntax**: `returnType methodName(parameters) { ... }`.
- **Method Overloading**: Same method name, different parameters.
  ```java
  int add(int a, int b) { return a + b; }
  double add(double a, double b) { return a + b; }
  ```

## Final Keyword in Java
- **Final Variables**: Constants, cannot be changed after initialization.
- **Final Methods**: Cannot be overridden.
- **Final Classes**: Cannot be inherited.

## Static in Java
- **Static Members**: Belong to the class, shared across instances.
- **Static Variables**: Single copy shared by all objects.
- **Static Methods**: Callable without an instance, e.g., `Math.sqrt()`.
- **Static Blocks**: Run once during class loading.

## Java Variables – Local vs Global
- **Local Variables**: Declared in methods, limited scope, must be initialized.
- **Global (Instance) Variables**: Declared in class, accessible to all methods, default values assigned.

## Java OOP Concepts
Object-Oriented Programming (OOP) organizes code using classes and objects:
- **Objects**: Instances with attributes (fields) and methods (behaviors).
- **Constructors**: Initialize objects, same name as class, no return type.
- **Inheritance**: Subclass inherits from superclass using `extends`.
- **Method Overriding**: Subclass redefines parent class method.
- **Abstract Classes/Methods**: Provide blueprints, require implementation in subclasses.
- **Encapsulation**: Hide data using private fields and public getters/setters.
- **Polymorphism**: Compile-time (overloading) and runtime (overriding).

## Java Access Modifiers
Control visibility of class members:
- `public`: Accessible everywhere.
- `protected`: Accessible in same package and subclasses.
- `default` (no modifier): Accessible in same package.
- `private`: Accessible only within the class.

## Interfaces in Java
Interfaces define contracts for classes:
- Methods are abstract by default (pre-Java 8).
- Support `default` and `static` methods (Java 8+).
- Classes implement interfaces using `implements`.
- Enable multiple inheritance of behavior.

## Exception Handling
Handles runtime errors:
- **Types**: Checked (e.g., `IOException`) and unchecked (e.g., `NullPointerException`).
- **Keywords**: `try`, `catch`, `finally`, `throw`, `throws`.
- **Example**:
  ```java
  try {
      int x = 10 / 0;
  } catch (ArithmeticException e) {
      System.out.println("Division by zero!");
  } finally {
      System.out.println("Cleanup code");
  }
  ```

## Java File Handling
Manage files using `java.io`:
- **File Class**: Represents file/directory paths, methods like `exists()`, `createNewFile()`.
- **FileWriter**: Write character data to files.
- **FileReader**: Read character data from files.
- **BufferedReader**: Efficient line-by-line reading.
- **Best Practices**: Use try-with-resources to auto-close files, handle `IOException`.

**Example**:
```java
try (FileWriter fw = new FileWriter("data.txt")) {
    fw.write("Hello World");
} catch (IOException e) {
    System.out.println("Error: " + e.getMessage());
}
```

This guide serves as a foundation for learning Java. For hands-on practice, try coding examples and explore advanced topics like cryptography, sorting algorithms, and recommendation systems as outlined in the original document.

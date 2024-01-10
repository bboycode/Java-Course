# OOP IN Java 
![[r_141679_jRF8A.jpg| 500x500]]
---
# Resources 

https://github.com/bboycode/Java-Course

---
# Recap 

![[r_2320300_8CgA3.jpg|500x500]]

- Basics of Java 
- Should be comfortable reading and programming in Java
---
## What we'll cover today:
- What is OOP 
- Using Data-Types
- Creating Data Types

---
# What is OOP

- OOP Stands for Object-Oriented Programming
- It is a coding style that breaks coding projects down into Objects 
---
# What is an Object 

- an Object is an abstraction representation of a much more complex Data Type 
- Example Pictures, colours, Files, etc...
- This allows us to use theses Data Types with out knowing how it's implemented. 

---
## Strings are Objects 

- Now we've been actually using Objects before in the form of Strings. They are not primitive. 
- In java and most programming langues Strings are actually complex data type.
- Strings have there own operations that we can operate on them.

---
#  The String API

![[Pasted image 20240103174115.png]]

---
## How to use Objects
- We can declare objects the same as primitive types

```java 
String s; //Objects in java are declared with a Capital letter. 
```

- each object is Initialized with a **constructor**.

![[Pasted image 20240105182156.png]]

- You can make as many objects as you want. 
---
## Invoking instance methods

- Now we can use operations on theses objects

```java
String s = "Hi";
int length = s.length(); //Gets the length of the string. 
String b = "Hello"; 
String c = s.concat(b); //concatenate string s and b together: s + b
```

---
## How are objects represented in memory

- A constructor creates an object and returns to the client a reference to that object, not the object itself. 
- Hence why objects are also called reference types. 
- This reference is used to accessing an object.  

---
## In Memory 

![[Pasted image 20240108155116.png]]

- When we assign a object to a variable we actually assign the memory address of where that object is stored in memory. 
- This is called a pointer. 

---
## Type conversion

- If you want to convert an object from one type to another, you have to write code to do it

---
## Aliasing 

```java
Picture a = new Picture("mandrill.jpg");
Picture b = a; 
a.set(col, row, color1); // a updated
b.set(col, row, color2); // a updated again
```

- When we assign a variable an object and then assign it to another variable it does not create a new object.
- Both variables now reference the same object.  
- This is called **aliasing**. 

![[Pasted image 20240108163314.png | 500 x500]]

---

## Immutable types

- An object from a data type is immutable if its data-type value cannot change once created. 
- Example Strings. 
- a mutable data type is one in which objects of that type have values that are designed to change. 

---

## Comparing objects 

- Similar to arrays objects compare the reference to memory and not the actual data-type.
```java
Color a = new Color(160, 82, 45); 
Color b = new Color(160, 82, 45); 
Color c = b;
```

- so (a \=\= b) will be false, but ( c \=\= b) will be true. 
- so you would have to code a method that checks if their values are equal. 

---

# Creating Data Types
- Live Demo
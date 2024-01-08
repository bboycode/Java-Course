# Intro to Java 
---
# Resource's 

https://github.com/bboycode/Java-Course

---

### In This course:
- How to install java 
- IDE's
- Hello world
- Types 
- Strings
- Variables 
- Loops
- Control flow
- Arrays 
- In/output
- Functions
- Bonus at the end
---
# How to install Java
- Linux (Recommended for 2nd year )
- Windows 
---
## Linux 

```bash 
$ sudo apt update && upgrade
$ sudo apt install default-jdk
```

---

## Windows

1. go to https://www.oracle.com/java/technologies/downloads/
2. Download for windows
3. Done. 
---
### IDE's - Integrated developer Environment

1. eclipse
2. Intelli J 
3. Netbeans
4. VS code
5. Neovim (What  I use) You will use this in 244. 

---

## Hello World

1. Create a file with the extension *.java* 
2. example Hello World.java

---

```java
public class Hello World {

    public static void main(String[] args){
        //This is a comment.
        System.out.println("Hello world");
    }
}
```

---

## Execution

```bash
$ javac Hello World.java
$ java Hello World
```

---
## What happens under the hood:

![[Pasted image 20231231112648.png]]

---
## Anatomy of a java program:

![[Pasted image 20231231113535.png]]

---
# Types 

- A data type is a set of values and a set of operations defined on those values.
- In Java there are 8 primitive types  
- Most common is int, char, float and boolean
---

## Int - Integers 

- Theses are whole numbers. Negative and Positive 
- Their range from $(-2^{31})\ \text{and}\  (2^{31}-1)$
- operations include: +, -, \*, /, %

```Java 
3 % 2 = 1 // The remainder is 1
```
---

## Floats - Floating point numbers

- This represent fractions/real numbers
- included in this is the float, double and long 
- float < double < long 
- operations include: +, -, \*, / 
- Can also handle scientific notation:

```
3.14e10 = 3.14 x 10^13
```
---
## Booleans

- represents **true** or **false**
- used for condition statements (if-else)
- operations include: && (and), || (or), ! (not) 

![[Pasted image 20240102022209.png]]

---
## Char - Characters
- any single character that is in-closed by single quotes '
```java
'a' //is a char
```

---
# Type Conversions

- Converting from one type to another 
- This is done by casting

```java
(int) 3.0 = 3 //is now int 
(double) 3 = 3.0 //is now double

 11 * (int) 0.25  = 0 // is now int
 11 * 0.25 = 2.75// is now double
```

---

# Strings

- An sequence of chars that are in-closed by double quotes ".
- Example Hello world program
- They are not primitive data types
- They are treated such because they are so useful 

---
## Operations on String 

- Because string are not primitive types the operations work a bit differently (more on this later)
- But some operations we've seen before will work such as +

```java
"Hello " + "world" = "Hello world"; // This joins the strings toegther called concatenation
```

- Also some data types automatically get converted to Strings with concatenation 

```java
String a = "1234";
int b = 99; 
String c = a + b;
Sytem.out.prinln(c); 
//output 123499
```

---
# Variables

- Variables are ways of storing theses data types into easier to use identifiers  
- Each variable must declare what type it holds 
- naming convention for variables is **camelCase** and for **GOBAL_VARIABLES** its all caps with underscores

```java 
int a = 123;
double b = 3.14;
boolean c = true; 
String d = "Hi"; 
```
---

# Loops

- Loops are used to repeat sections in code.
- There are 3 different types of loops, *while*, *for* and *do-while*. 
---

## Examples of While loop

```java 
public class loops{

    public static void main(String[] args){
        int i = 0; // for counting

        while( i < 10 ){
            System.out.println("Hello World " + i);
            i++; 
            //outputes Hello World 0..9  
        }
    }
}
```
---
## Example of for loop 

```java
for( int j = 0; j < 10; j++){
    System.out.println("Hello World " + j);
    //outputes Hello World 0..9  
}

```
---
## Example of do-while

```java
int i = 0; 
do{
    System.out.println("Hello World " + i) 
    i++;
    //outputes Hello World 0..9  
}while( i < 10); 
```
---

## Comparison

- Used for control flow of the program 
- produces a boolean, *true* or *false*
- can be used with boolean operations

---

# Control flow

- what if we want to or program to have branching paths
- we can use *if* and *else* statements 

```java 
boolean b = true; 
if (b){

    System.out.println("b is true");

} else{

    Sytem.out.println("b is not true");
}
```

---
## Else-if

- we can also use else-if to clean up the code.

```java
boolean a = true;
boolean b = false; 

if (a && b ){

    System.out.println("a and b is true"); 
    
} else if (a == true && b == false) {

    System.out.println("a true and b is false");

} else {

    System.out.println("a and b are both false"); 
}
```

---

## Switch case statements
- use to avoid every long else-if statements

```java
int day = 4;
switch (day) {
  case 1:
    System.out.println("Monday");
    break;
  case 2:
    System.out.println("Tuesday");
    break;
  case 3:
    System.out.println("Wednesday");
    break;
  case 4:
    System.out.println("Thursday");
    break;
  case 5:
    System.out.println("Friday");
    break;
  case 6:
    System.out.println("Saturday");
    break;
  case 7:
    System.out.println("Sunday");
    break;
}
```
 
---

# Arrays 

-  Arrays are used to store a list of data types
- It can only store data types that are the same type.
- We'll go over 1-D and 2-D arrays

---
## Example of Arrays

```java
int[] numbers = {1, 2, 3}; // arrays start counting at 0.

//or 

int[] numbers = new int[3]; 
numbers[0] = 1;
numbers[1] = 2; 
numbers[2] = 3;
```

```java 
for(int i = 0; i < numbers.length; i++) {

    System.out.println("Element at index " + i + " : " + numbers[i]); 
}
```

---

## 2-D Array

```java 
int[][] array = {{1,2},
                 {3,4}};

//or 

int[][] arrayTwo = new int[2][2]

arrayTwo[0][0] = 1;
arrayTwo[0][1] = 2;
arrayTwo[1][0] = 3;
arrayTwo[1][1] = 4;
```

```java
for(int i = 0; i < array.length; i++) {

    for(int j = 0; j < array[i].length; j++ ){

        System.out.println("Element at index " + "[" + i + "] , [" + j + "] " + ":" + array[i][j]); 
    }

    System.out.println();
}
```

---
## Comparing Arrays

- Array variable names are actually references in memory
- This means comparisons do not work as they should

```java 
int[] arrA = {1, 2, 3};
int[] arrB = {1, 2, 3};
int[] arrC = arrA; 

System.out.println(ArrA == ArrB); //false
System.out.println(arrC == arrA); //true
```

---

# In/Output

- We've seen how to get output from our programs. Now we need input.
- 2 methods of getting input
- Command-Lines arguments and files 

---

## Command-Line arguments

```java
public class Input {

    public static void main(String[] args){
        String name = args[0]; 
        Stringh name2 = args[1]; 

        System.out.println("Hi my name is " + name + " " + name2); 
    }
}
```

```bash
$ java Input Slim Shady 

Hi my name is Slim Shady
```

- Command-line arguments is an array of inputs   
---

## Math program with input

``` java 
public class Math {

    public static void main(String[] args){

        int number = Intger.parseInt(args[0]); //converting a String to int


        System.out.println(2 + number); 
    }
}
```

---
## Input from files 

```java
import java.util.Scanner;  // Import the Scanner class

public class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(args[0]);  // Create a Scanner object

    String userName = myObj.nextLine();  // Read user input
    System.out.println("Username is: " + userName);  // Output user input
  }
}
```


---

# Functions

- Function enable us to break down programs into smaller chunks
- helps with readability and reusability. 

---

## Anonymity of a function 

```java 
public static void foo(int n){

    for(int i = 0; i < n; i++){

        System.out.println("foo"); 
    }
}
```

- Functions should have a return type (void means it returns nothing)
- a function can have parameters. Example *int n*. 

---
## Scope 
- This is what variables your program can see.
- A good way to know the scope is to look at the curly braces
---

## References with functions

```java
int[] array = {1, 2, 3, 4, 5};

public static void modifyArray(int[] arr) {

    for (int i = 0; i < arr.length; i++) { 

    arr[i] = arr[i] * 2; 
    
    }
}
// array = {2, 4, 6, 8, 10}; 
```

- Because the array is a reference that points to blocks in memory we don't need to have a return type.
---

- however. 
 
```java 
int number = 10; 
 public static void modifyPrimitive(int number) {
        number *= 2;
    }

System.out.println(number); // value will still be 10
```

- We need to add a return type to this function because it does not accesses it in memory. 
---

## Recursion

- Recursion is a programming technique where a function calls itself to solve a problem by breaking it into smaller instances until a base case is reached.

```java
// Recursive method to calculate factorial
    public static long factorial(int n) {
        // Base case: factorial of 0 or 1 is 1
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // Recursive case: n! = n * (n-1)!
            return n * factorial(n - 1);
        }
    }
}
```

---
# Some Tips from experience

- Google and chatGPT is your friend 
- Practice, practice, practice !
- If points one and two fail don't be afraid to ask for help. 

---
# Homework

 A Sudoku Solver

1. Must take a file that contains the board
2. Must print out the before and after of the board
3. use backtracking algorithm ( GOOGLE THIS !!!)

---

# My ted talk is done

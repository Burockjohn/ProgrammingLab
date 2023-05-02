package string;

import java.util.Scanner;

public class IndexOfA {

    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
        Scanner s = new Scanner(System.in);
        String word = s.next();

        //WRITE YOUR CODE BELOW

        System.out.println("Index of a: " + word.indexOf("a"));


    }


}

/*

### Use `String methods` to find the index of the letter `a` in the given `word`. Print the index of the character:

> Index of a: $index number

#### Note: If there is multiple occurrences of the letter `a` we will output only the index of the first occurrence

Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation

```
Ex:
  Input:
    apple

  Output:
    Index of a: 0
```
```
Ex:
  Input:
    java

  Output:
    Index of a: 1
```
```
Ex:
  Input:
    pen

  Output:
    Index of a: -1
```

 */

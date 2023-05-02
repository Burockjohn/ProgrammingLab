package string;

import java.util.Scanner;

public class VerifyEquals {

    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
        Scanner s = new Scanner(System.in);
        String word1 = s.next();
        String word2 = s.next();

        //WRITE YOUR CODE BELOW

        System.out.println(word1.equals(word2));


    }

}


/*

### Use `String methods` to check if the two given words, `word1` and `word2` are the same (equal).
The values of `word1` and `word2` will be inputs from a Scanner, but you only need to interact with the String variables.
Output a `boolean value, true or false`.

#### Note: Comparison should be case sensitive. "java" and "JaVa" are not equal.

Main topics: String manipulation, Scanner, methods, primitive datatypes

```
Ex:
  Input:
    java
    jaVA

  Output:
    false
```
```
Ex:
  Input:
    Java
    Java

  Output:
    true

 */

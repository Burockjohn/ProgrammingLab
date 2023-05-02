package string;

import java.util.Scanner;

public class CaseSensitivity {
    public static void main(String[] args) {

        //DO NOT TOUCH BELOW

        Scanner s = new Scanner(System.in);
        String word = s.next();

        //WRITE YOUR CODE BELOW
        System.out.println("word: " + word);
        System.out.println("uppercase: " + word.toUpperCase());
        System.out.println("lowercase: " + word.toLowerCase());


    }
}

/*

### Use `String methods` to change the given `word` to all uppercase characters and all lowercase characters.
The value of `word` will be input from a Scanner, but you only need to interact with the String variable.
Output in the following format:

> word: $given word

> uppercase: $given word as all uppercase

> lowercase: $given word as all lowercase

Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation

```
Ex:
  Input:
    jAVa

  Output:
    word: jAVa
    uppercase: JAVA
    lowercase: java
```

 */
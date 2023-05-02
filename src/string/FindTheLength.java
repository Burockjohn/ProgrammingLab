package string;

import java.util.Scanner;

public class FindTheLength {

    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = input.next();

        // WRITE YOUR CODE BELOW
        int length = word.length();
        System.out.println("Length is: " + length);


    }


}

/*

### Use `String methods` to find the number of characters for the given `word` variable.
The value of the `word` will be input from a Scanner, but you only need to interact with the String variable.
Output in the following format:

#### Length is: $length

Main topics: String manipulation, Scanner, methods, primitive data types

```
Ex:
  Input:
    java

  Output:
    Length is: 4
```
```
Ex:
  Input:
    apple

  Output:
    Length is: 5
```

 */
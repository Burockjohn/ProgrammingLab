package statements;

import java.util.*;

public class GreateNumber {

    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        //WRITE YOUR CODE HERE:
        if (a > b) {
            System.out.println(a + " is greater");

        } else {
            System.out.println(b + " is greater");
        }


    }
}

/*
### Use an `if statement` to determine if the given number `a` is greater than the other given number `b`.
Print out which is the biggest in the following format:

#### $number is greater

#### Note: The two given numbers will not be equal

Main topics: if statements, primitive variables, concatenation, operators

```
Ex:
  Input:
    1
    2

  Output:
    2 is greater
```
```
Ex:
  Input:
    7
    4

  Output:
    7 is greater
```

 */
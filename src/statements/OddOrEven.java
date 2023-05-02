package statements;

import java.util.*;

public class OddOrEven {

    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();

        //WRITE YOUR CODE BELOW

        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }


    }

}

/*
### Use an `if statement` to determine if the given `int` `number` is even or odd. Print the following message:

#### $number is even_or_odd

Main topics: if statements, primitive variables, concatenation, operators

```
Ex:
  Input:
    10

  Output:
    10 is even
```
```
Ex:
  Input:
    33

  Output:
    33 is odd
```

Note: The number 0 will not be an input

 */

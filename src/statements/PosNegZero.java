package statements;

import java.util.*;

public class PosNegZero {

    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        //WRITE YOUR CODE BELOW
        String result;

        if (num > 0) {
            result = "positive";
        } else if (num < 0) {
            result = "negative";
        } else {
            result = "zero";
        }
        System.out.println(result);


    }

}

/*
### Use `if statements` to determine if the given `int` `num` is positive, negative, or zero.
Only print one of these three options.

#### Note: Can be done with 3 separate if statement or a multi branch if statement

Main topics: if statements, primitive variables, operators

```
Ex:
  Input:
    1

  Output:
    positive
```
```
Ex:
  Input:
    -6

  Output:
    negative
```
```
Ex:
  Input:
    0

  Output:
    zero
```
 */

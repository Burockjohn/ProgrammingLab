package methods;

import java.util.Scanner;

public class Sign {
    public static void sign(
            int n) {
        //WRITE YOUR CODE BELOW

        if (n > 0) System.out.println("positive");
        else if (n < 0) System.out.println("negative");
        else System.out.println("zero");


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        sign(n);

    }

}

/*

### Finish the given method `sign()` to print if the number is a positive number, negative number, or zero.
The `sign()` method is already called in the main method and is also given an argument `n`.
The value of `n` is coming from a Scanner input, but should be treated as just a number.

#### This is a `void` method with an `int` parameters

Main topics: methods, Scanner, primitive datatypes, if statements, operators

Example:
```
  sign(5)

output:
  positive
```
Example:
```
  sign(-30)

output:
  negative
```
Example:
```
  sign(0)

output:
  zero

 */
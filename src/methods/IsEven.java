package methods;

import java.util.Scanner;

public class IsEven {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isEven(in.nextInt()));
    }

    public static boolean isEven(int num) {
        //WRITE YOUR METHOD

        return num % 2 == 0;


    }

}
/*

### Finish the method called `isEven()` that will take an `int`argument and return if the given number is even as a `boolean`.
If the number is even the method returns `true`, but if the number is odd the method returns `false`.
The `isEven()` method is being called in the main method and given an argument.

#### This is a `return` method with an `int` parameter

Main topics: methods, Scanner, primitive datatypes, operators, if statements

Example:
```
  isEven(4)

output:
  true
```
Example:
```
  isEven(7)

output:
  false

 */
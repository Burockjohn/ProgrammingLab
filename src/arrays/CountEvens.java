package arrays;

import java.util.Scanner;

public class CountEvens {

    public static void main(String[] args) {

        //DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //WRITE YOUR CODE BELOW:

        int count = 0;

        for (int each : nums) {
            if (each % 2 == 0) count++;
        }

        System.out.println(count);
    }
}

/*

### Given an `int []` `nums`, find and print how many even numbers are in the array.

#### Note: The loop used in the given code is to dynamically create the int array. You don't need to fully understand this part yet,
focus only on having access to an array and has some numbers.

Main topics: arrays, primitive datatypes, concatenation, index, operators, loops, if statements

Example:
```
Input:
  [2, 1, 2, 3, 4]

Output:
  3
```
Example:
```
Input:
  [1, 3, 5, 7, 9]

Output:
  0
```

 */

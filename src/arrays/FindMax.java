package arrays;

import java.util.Scanner;

public class FindMax {

    public static void main(String[] args) {

        // DO NOT TOUCH BELOW
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //WRITE YOUR CODE BELOW

        int max = nums[0];

        for (int each : nums) {

            if (each > max) max = each;

        }

        System.out.println(max);


    }
}

/*

### Given an `int []` `nums`, find the print the max number. In other words: find the biggest element in the array.

#### Note: The loop used in the given code is to dynamically create the int array. You don't need to fully understand this part yet,
focus only on having access to an array and has some numbers.

Main topics: arrays, primitive datatypes, concatenation, index, operators, loops, if statements

Example:
```
Input:
  [2, 4, 2, 3, -2]

Output:
  4
```
Example:
```
Input:
  [1, 33, 5, 7, 9]

Output:
  33
```

 */
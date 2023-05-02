package arrays;

import java.util.Scanner;

public class SecondElement {

    public static void main(String[] args) {

        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }

        //WRITE YOUR CODE BELOW

        System.out.println("Second element: " + nums[1]);
        System.out.println("Second to last element: " + nums[nums.length - 2]);


    }
}

/*

### Given an `int []` `nums` print the second element and the second to last element in the following format:

```
Second element: $second element
Second to last element: $second to last element
```

#### Note: The loop used in the given code is to dynamically create the int array. You don't need to fully understand this part yet,
focus only on having access to an array and has some numbers.

Main topics: arrays, primitive datatypes, concatenation, index

Example:
```
Input:
  [1, 2, 3, 4, 5]

Output:
  Second element: 2
  Second to last element: 4
```
Example:
```
Input:
  [3, 100, 5, 140, 12, 5, 9]]

Output:
  Second element: 100
  Second to last element: 5
```

 */
package arrays;

import java.util.Scanner;

public class NonDuplicate {

    public static void main(String[] args) {

        //DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //WRITE YOUR CODE BELOW:

        for (int eachNum : nums) {
            int counter = 0;
            for (int eachElement : nums) {

                if (eachNum == eachElement) counter++;
            }

            if (counter == 1) {
                System.out.println(eachNum);
                break;
            }


        }


    }
}

/*

### Given an `int []` `nums` that has duplicate numbers, which means each numbers is found twice in the array.
Find and print the non-duplicate number, which mean the ones that does not have two occurrences of it.
If there is more than one, return the first unique in array!

Main topics: arrays, primitive datatypes, index, operators, loops, if statements, counter

Example:
```
Input:
  [1, 2, 3, 4, 3, 4, 1]

Output:
  2
```

```
Input:
  [6, 44, 6, 4, 3, 4, 1]

Output:
  44 (more than one unique number. but 44 is the first)
```

 */
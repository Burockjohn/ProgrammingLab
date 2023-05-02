package methods;

import java.util.Scanner;

public class UniqueNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of array!!!");
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums) {
        //WRITE YOUR CODE HERE


        for (int num : nums) {
            int counter = 0;
            for (int each : nums) {

                if (num == each) counter++;
            }

            if (counter == 1) System.out.println(num);

        }

    }


}

/*

### Finish the method called `printUniqueNumbers()` that will take an`int []` and print out all the unique numbers in the array.
A number is unique when it is only found in the array one time.

#### This is a `void` method with an `int []` parameter

Main topics: methods, Scanner, loops, arrays, primitive datatypes, operators, if statements

Example:
```
  nums = [2, 5, 5, 6, 3, 6, 9, 34, 3];
  printUniqueNumbers(nums)

output:
  2
  9
  34
```
Example:
```
  nums = [4, 5, 11, 5, 6, 1, 4];
  printUniqueNumbers(nums)

output:
  11
  6
  1
```

 */
package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {

        //DO NOT TOUCH FOLLOWING LINES:
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextLine();
        }

        //WRITE YOUR CODES BELOW:

        String reversed[] = new String[arr.length];

        int j = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            reversed[j++] = arr[i];
        }

        System.out.println(Arrays.toString(reversed));


    }
}

/*

### Given a `String []` `words`, go through the array and reverse it. Print the reversed array where the order of the elements is changed.

#### Note: The loop used in the given code is to dynamically create the string array. You don't need to fully understand this part yet, focus only on having access to an array.

Main topics: arrays, primitive datatypes, concatenation, index, operators, loops, String

Example:
```
Input:
  [hello, why, by, apple, note]

Output:
  [note, apple, by, why, hello]

 */

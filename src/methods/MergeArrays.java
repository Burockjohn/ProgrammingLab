package methods;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArrays {

    public static int[] merge(int[] a, int[] b) {

        int merge[] = new int[a.length + b.length];

        int i = 0;

        for (int x : a) {
            merge[i++] = x;
        }

        for (int y : b) {
            merge[i++] = y;
        }

        return merge;


    }//end merge

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[in.nextInt()];
        int[] nums2 = new int[in.nextInt()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(merge(nums, nums2)));
    }
}

/*

### Finish the method called `merge()` that will take two `int[]` argument `a` and `b` and returns an `int[]`.
Merge the given two arrays into one and return the merged array. Merging the elements will mean adding all the elements from `a` and
then adding all the elements of `b` into the array after. The `merge()` method is already called in the main method with an argument.

#### This is a `return` method with two `int[]` parameter

Main topics: methods, Scanner, arrays, loops

Example:
```
	merge([1,2,3],[4,5,6]);

output:
	[1,2,3,4,5,6]
```
Example:
```
	merge([1,2],[6,8]);

output:
	[1,2,6,8]
```


 */
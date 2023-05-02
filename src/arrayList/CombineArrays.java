package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CombineArrays {

    public static ArrayList<String> combine(String[] r1, String[] r2) {

        // your code here
        ArrayList<String> list = new ArrayList<>(Arrays.asList(r1));
        list.addAll(Arrays.asList(r2));
        return list;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] strs = new String[in.nextInt()];
        String[] strs2 = new String[in.nextInt()];
        for (int i = 0; i < strs.length; i++) {
            strs[i] = in.next();
        }
        for (int i = 0; i < strs2.length; i++) {
            strs2[i] = in.next();
        }

        System.out.println(combine(strs, strs2));

    }

}

/*

### Finish the method called `combine()` that will take two `String[]` arguments `r1` and `r2` and returns an `ArrayList<String>`.
Use an ArrayList to merge the elements from both given `String[]` into one data structure. The `combine()` method is already called in the main method with an argument.

#### This is a `return` method with two `String[]` parameters

Main topics: methods, Scanner, ArrayList, loops, array

Example:
```
	combine(["f","o","o"],[" b","a","r"]);

output:
	[f, o, o, b, a, r]
```
Example:
```
	combine(["1","2","3"],["4"]);

output:
	[1, 2, 3, 4]
```

 */
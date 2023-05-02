package methods;

import java.util.Scanner;

public class CountDuplicatedElements {

    public static int getDup(String[] arr) { //6,a,d,a,a,a,d

        int count = 0;
        for (String each : arr) {
            int counter = 0;
            for (String element : arr) {
                if (each.equals(element)) counter++;
            }

            if (counter == 1) count += counter;
        }
        return arr.length - count;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] strs = new String[in.nextInt()];
        for (int i = 0; i < strs.length; i++) {
            strs[i] = in.next();
        }

        System.out.println(getDup(strs));

    }
}

/*

### Finish the method called `getDup()` that will take a `String[]` argument `arr` and return an `int`. Find and return the number of duplicate
elements. Any element is duplicate if it appears in the array more than once. The `getDup()` method is already called in the main method
with an argument.

#### This is a `return` method with `String[]` parameter

Main topics: methods, Scanner, arrays, loops, String

Example:
```
	String [] arr = {"1","2","aa"',"1"};
	getDup(arr);

output:
	2
	("1" is duplicated and there are two "1"s so return is 2)
```
Example:
```
	String [] arr = {"1","2","aa"',"1", "aa"};
	getDup(arr);

output:
	4
	("1" is duplicated and there are two "1"s and two "aa"s so return is 4)
```
Example:
```
	String [] arr = {"1","g","aabb',"7","7","2","aa"',"7"};
	getDup(arr);

output:
	3
	("7" is duplicated three times and there is not other duplicate elements so return is 3)
```

 */
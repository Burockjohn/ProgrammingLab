package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class TimesTwo {

    public static ArrayList<Integer> timesTwo(ArrayList<Integer> nums) {

        ArrayList<Integer> list = new ArrayList<>();

        for (Integer each : nums) {
            list.add(each * 2);
        }

        return list;


    }


    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(timesTwo(list));

    }

}

/*

### Finish the method called `timesTwo()` that will take an `ArrayList<Integer>` argument `nums` and returns an `ArrayList<Integer>`.
Take each number from `nums` and multiply them by two. Store the result in the list being returned.
The `timesTwo()` method is already called in the main method with an argument.

#### This is a `return` method with an `ArrayList<Integer>`

Main topics: methods, Scanner, ArrayList, loops, operators

Example:
```
	timesTwo([1, 5, 5, 8, 6])

output:
	[2, 10, 10, 16, 12]
```
Example:
```
	timesTwo([0, 0, 8, 5, 2, 6])

output:
	[0, 0, 16, 10, 4, 12]
```

 */
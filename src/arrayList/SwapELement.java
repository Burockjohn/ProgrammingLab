package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SwapELement {

    public static ArrayList<String> swap(ArrayList<String> list, int pos1, int pos2) {

        Collections.swap(list, pos1, pos2);
        return list;

    }


    // Do not touch below


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int pos1 = in.nextInt();
        int pos2 = in.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(in.next());
        }

        System.out.println(swap(list, pos1, pos2));

    }

}

/*

### Finish the method called `swap()` that will take an `ArrayList<String>` argument `list` and two `int` numbers `pos1` and `pos2`. The method returns an `ArrayList<String>` which has the elements at indexes `pos1` and pos2` swapped. Swapping means they will change positions in the ArrayList and all other elements will remain untouched. The `swap()` method is already called in the main method with an argument.

#### This is a `return` method with an `ArrayList<String>` parameter

Main topics: methods, Scanner, ArrayList

Example:
```
	swap(["one","two","three"],0,2);

output:
	["three","two","one"]
```
Example:
```
	swap(["a","c","b","d","e"],0,3);

output:
	["d","c","b","a","e"]
```


 */
package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Search {

    public static String search(ArrayList<String> strs, String find) {
        // complete the method

        ArrayList<String> list = new ArrayList<>();

        for (String each : strs) {

            if (each.contains(find)) return each;
        }

        return "search failed";
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String find = in.next();
        in.nextLine();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(in.nextLine());
        }
        System.out.println(search(list, find));
    }


}

/*

### Finish the method called `search()` that will take an `ArrayList<String>` argument `strs` and a `String` `find`.
The method returns a `String`. Search through elements in `strs` and check if the `find` `String` is contained in any of the elements.
Return the word that contains `find`, but if `strs` does not contain the `find` anywhere return _"search failed"_.
The `search()` method is already called in the main method with an argument.

#### This is a `return` method with an `ArrayList<String>` and `String` parameters

Main topics: methods, Scanner, ArrayList, loops, String

Example:
```
	search(["one apple","two orange","four banana"],"four")

output:
	four banana
	("four banana" contains "four" so method returns "four banana")
```

Example:
```
	search(["hello","world"],"goodbye")

output:
	"search failed"
	(no "goodbye" in any element)
```

 */

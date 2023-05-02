package methods;

import java.util.Scanner;

public class CountAppearance {

    public static int countAppearance(String[] arr, String word){

        int counter = 0;
        for(String each : arr) {
            if(each.equals(word)) counter++;
        }

        return counter;




    } //end  count_appearance

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        String[] strs = new String[in.nextInt()];
        System.out.println("Enter the search word:");
        String word = in.next();
        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }

        System.out.println(countAppearance(strs,word));

    }

}

/*

### Finish the method called `countAppearance()` that will take `String []` and `String` arguments and return an `int`
for the number of times the given `String` `word` is found in the given `String []` `arr`.

#### This is a `return` method with `String[]` and `String` parameters

Main topics: methods, Scanner, loops, String, arrays, primitive datatypes, operators, if statements

Example:
```
  arr = ["a","foo","bar","foo","bla"];
  countAppearance(arr, "foo")

output:
  2
```
Example:
```
  arr = ["a","foo","bar","foo","bla"];
  countAppearance(arr, "bla")

output:
  1
```
Example:
```
  arr = ["a","foo","bar","foo","bla"];
  countAppearance(arr, "java")

output:
  0
```

 */
package arrayList;

import java.util.Scanner;

public class ExtractNumber {

    public static String extractNum(String s) {

        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) result += s.charAt(i);
        }

        return result;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(extractNum(in.next()));
    }
}

/*

### Finish the method called `extractNum()` that will take a `String` argument `s` and returns a `String`.
The `String` returned should be only the number characters from the given `s` String.
The `extractNum()` method is already called in the main method with an argument.

#### This is a `return` method with a `String` parameter

Main topics: methods, Scanner, wrapper classes, String

Example:
```
	extractNum("aa2aa3");

output:
	23
```
Example:
```
	extractNum(""aa!!%$#.10aa"");

output:
	10
```


 */
package string;

import java.util.Scanner;

public class WithoutX {

    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        String result = word;

        if (word.startsWith("x") || word.startsWith("X")) {
            if (word.endsWith("x") || word.endsWith("X")) {
                result = word.substring(1, word.length() - 1);
            } else {
                result = word.substring(1);
            }

        } else if (word.endsWith("x") || word.endsWith("X")) {
            result = word.substring(0, word.length() - 1);

        }

        System.out.println(result);
    }
}



/*

### Use `String methods` to modify the given `word` based on the following rules:

> - If `word` starts with or ends with `x` or `X` print the String without those `x` characters
> - If there is no `x` or `X` as the first or last character print the `word` untouched

Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation

```
Ex:
  Input:
    xHiX

  Output:
    Hi
```
```
Ex:
  Input:
    apple

  Output:
    apple
```
```
Ex:
  Input:
    xUxL

  Output:
    UxL
```
```
Ex:
  Input:
    JavaX

  Output:
    Java
```

 */
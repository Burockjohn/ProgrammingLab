package string;

import java.util.Scanner;

public class ReverseIt {

    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //WRITE YOUR CODE BELOW

        int num = word.length();
        String result;

        if (num == 5) {
            result = "" + word.charAt(4) + word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0);
        } else if ( num > 5) {
            result = "Too long!";
        } else {
            result = "Too short!";
        }

        System.out.println(result);



    }
}

/*

### Use `String methods` and `if statements` to reverse a String that is five characters long. If the given `word`
is not five characters long, it will not be reversed. Use the following to output a value:

> - If the `word` is less than 5 characters: print `Too short!`
> - If the `word` is more than 5 characters: print `Too long!`
> - If the `word` is 5 characters: print the `reversed version` of the String. Reading characters from the end to the beginning.


Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation, if statements

```
Ex:
  Input:
    cat

  Output:
    Too short!
```

```
Ex:
  Input:
    singularity

  Output:
    Too long!
```
```
Ex:
  Input:
    apple

  Output:
    elppa
```

 */
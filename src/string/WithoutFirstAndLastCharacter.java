package string;

import java.util.Scanner;

public class WithoutFirstAndLastCharacter {

    public static void main(String[] args) {
        //DO NOT TOUCH THIS PART
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //WRITE YOUR CODE HERE BURAK 01234

        System.out.println("without first letter: " + word.substring(1));
        System.out.println("without last letter: " + word.substring(0, word.length() -1));

    }


}

/*

### Use `String methods` to print the given `word` without the first character and another output of the `word` without the last character. The value of the `word` will be input from a Scanner, but you only need to interact with the String variable. Output in the following format:

> without first letter: $word without the first character

> without last letter: $word without the last character

Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation

```
Ex:
  Input:
    adobe

  Output:
    without first letter: dobe
    without last letter: adob
```

```
Ex:
  Input:
    run

  Output:
    without first letter: un
    without last letter: ru
```

 */

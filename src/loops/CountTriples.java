package loops;

import java.util.Scanner;

public class CountTriples {


    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner input = new Scanner(System.in);

        //WRITE YOUR CODE BELOW
        System.out.println("Enter a string:");
        String str = input.nextLine();
        int countTriples = 0;

        for (int i = 0; i <= str.length()-3; i++) {
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(i+1);
            char ch3 = str.charAt(i+2);
            if (ch1 == ch2 && ch2 == ch3) {
                countTriples++;
            }
        }

        System.out.println("Total number of triples: " + countTriples);

        //alternative solution



    }

}


/*

### Use a `loop` to count the number of triples in the given `str`. A triple is when the same character appears three times in a row.
So if there is a specific character that is repeated three times, that will be counted as one triple.
Print the total number of triples found in the String. The triples may overlap.

Main topics: loops, primitive datatypes, operators, Scanner, String, if statements

```
Ex:
  Input:
    abcXXXabc

  Output:
    1
```
```
Ex:
  Input:
    xxxabyyyycd

  Output:
    3

  -> the triples found are xxx yyy and another yyy
```
```
Ex:
  Input:
    java

  Output:
    0
```

 */
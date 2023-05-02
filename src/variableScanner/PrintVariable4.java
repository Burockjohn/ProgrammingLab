package variableScanner;

import java.util.Scanner;

public class PrintVariable4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        System.out.println("Today's word of the day is: " + word);


    }




}


/*

### Given a String variable **`word`** that has some value (from Scanner), use the variable to display the word of the day.

**Note:** You don't need to do anything with the Scanner.  Use the variable as done before.

Main topics: print statement, variables, String, concatenation, Scanner

```
Ex:
  Input:
    Java

  Output:
    Today's word of the day is: Java
```
```
Ex:
  Input:
    Apple

  Output:
    Today's word of the day is: Apple
```

 */
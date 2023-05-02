package loops;

import java.util.Scanner;

public class CountHi {


    public static void main(String[] args) {

        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine().toLowerCase();

        //WRITE YOUR CODE BELOW

        int counter = 0;

        while (str.contains("hi")){
            str = str.replaceFirst("hi","");
            counter++;
        }

        System.out.println(counter);


    }
}

/*

### Use a `loop` to count how many times the characters `hi` are found in the given String `str`. Only consider the lowercase characters for `hi`.

Main topics: loops, primitive datatypes, operators, Scanner, String, if statements

```
Ex:
  Input:
    abc hi how

  Output:
    1
```
```
Ex:
  Input:
    hihi bye

  Output:
    2
```
```
Ex:
  Input:
    apple

  Output:
    0
```

 */
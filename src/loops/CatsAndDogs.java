package loops;

import java.util.Scanner;

public class CatsAndDogs {
    
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine().toLowerCase();

        //WRITE YOUR CODE BELOW

        int countCat = 0,
                countDog= 0;

        while (str.contains("cat") || str.contains("dog")) {

            if(str.contains("cat")) {
                str = str.replaceFirst("cat","");
                countCat++;
            } else {
                str = str.replaceFirst("dog","");
                countDog++;
            }
        }

        if(countCat == countDog) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
    


}

/*
### Use a `loop` to count how many times the characters `cat` and `dog` are found in the given String `str`.
Output `true` if `cat` and `dog` appear the same number of times, otherwise output `false`
Main topics: loops, primitive datatypes, operators, Scanner, String, if statements

```
Ex:
  Input:
    catdog

  Output:
    true
```
```
Ex:
  Input:
    catcat

  Output:
    false
```
```
Ex:
  Input:
    cat-cheetah-dog-cat

  Output:
    false
```

 */
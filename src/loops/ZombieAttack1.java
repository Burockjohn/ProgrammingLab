package loops;

import java.util.Scanner;

public class ZombieAttack1 {

    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES:
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        //WRITE YOUR CODE HERE:

        int counter = 0;

        while (inhabitants > 0) {
            System.out.println("Day " + counter + " [" + inhabitants + "]");

            inhabitants /= 2;
            counter++;

        }

        System.out.println("---- EXTINCT ----");
    }


}


/*

### There is a zombie disease pandemic wiping out populations. Use a `loop` to keep track of the city's population.
The starting population is given as the `inhabitants` value. Each day the city is losing half of its population.
Write the program that will show the population day by day, until the city gets to zero.

#### Note: Case sensitivity should be considered. We are looking for the lowercase character versions of both Strings

Main topics: loops, primitive datatypes, operators, Scanner, concatenation

```
Ex:
  Input:
    6

  Output:
    Day 0 [6]
    Day 1 [3]
    Day 2 [1]
    ---- EXTINCT ----
```
```
Ex:
  Input:
    20

  Output:
    Day 0 [20]
    Day 1 [10]
    Day 2 [5]
    Day 3 [2]
    Day 4 [1]
    ---- EXTINCT ----
```

 */
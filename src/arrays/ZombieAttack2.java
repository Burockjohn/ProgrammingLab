package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ZombieAttack2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //Write you code below this line.

        int day = 0;

        System.out.println("Day " + day + " " + Arrays.toString(inhabitants));

        int extinct[] = new int[inhabitants.length];

        while (!Arrays.equals(inhabitants, extinct)) {

            int temp[] = Arrays.copyOf(inhabitants, inhabitants.length);

            for (int i = 0; i < temp.length; i++) {
                int city = temp[i];

                if (city != 0) {
                    if (i > 0 && temp[i - 1] == 0 || i < temp.length - 1 && temp[i + 1] == 0) {
                        city /= 2;
                        inhabitants[i] = city;
                    }
                }
            }

            day++;
            System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
        }

        System.out.println("---- EXTINCT ----");

    }

}

/*

An array **inhabitants** represents cities and their respective populations. For example, the following arrays shows 8 cities and
their respective populations:

```
[3, 6, 0, 4, 3, 2, 7, 0]
```

Some cities have a population of 0 due to a pandemic zombie disease that is wiping out the human lives. After each day,
**any city that is adjacent to a zombie-ridden city will lose half of its population (City that has a 0 population)**.

Write a program to loop though each city population and make it lose half of its population if it is adjacent(right or left)
to a city with zero people until all cities have no humans are left.

Make updates to each element in the array and print the array like below for each day:

Note: A city can only be affected once each day

```
Day 0 [3, 6, 0, 4, 3, 2, 7, 0]
Day 1 [3, 3, 0, 2, 3, 2, 3, 0]
Day 2 [3, 1, 0, 1, 3, 2, 1, 0]
Day 3 [3, 0, 0, 0, 3, 2, 0, 0]
Day 4 [1, 0, 0, 0, 1, 1, 0, 0]
Day 5 [0, 0, 0, 0, 0, 0, 0, 0]
---- EXTINCT ----
```

Write the program in a way that it will handle any number of people in cities, above was just an example.


 */
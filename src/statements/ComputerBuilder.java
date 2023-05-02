package statements;

import java.util.Scanner;

public class ComputerBuilder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String result = "";

        int size13_3 = 200,
                size15_0 = 300,
                size17_3 = 400,
                i3 = 150,
                i5 = 250,
                i7 = 350,
                fullHD = 100,
                _4K = 200;
        double amount = 0;

        System.out.println("Select screen size:");
        String answer1 = input.nextLine();

        if (answer1.equals("13.3")) {
            amount += size13_3;
        } else if (answer1.equals("15.0")) {
            amount += size15_0;
        } else if (answer1.equals("17.3")) {
            amount += size17_3;
        }

        System.out.println("Select CPU type:");
        String answer2 = input.next();

        if (answer2.equals("i3")) {
            amount += i3;
        } else if (answer2.equals("i5")) {
            amount += i5;
        } else if (answer2.equals("i7")) {
            amount += i7;
        }

        System.out.println("Select RAM size:");
        int answer3 = input.nextInt();

        amount += 50 * (answer3 / 4);

        System.out.println("Select storage type:");
        String answer4 = input.next();

        System.out.println("Select storage size:");
        int answer5 = input.nextInt();

        if (answer4.equals("HDD")) {
            amount += 50 * (answer5 / 500);
        } else if (answer4.equals("SSD")) {
            amount += 100 * (answer5 / 500);
        }

        System.out.println("Select screen resolution:");
        String answer6 = input.next();

        if (answer6.equals("FULLHD")) {
            amount += fullHD;
        } else if (answer6.equals("4K")) {
            amount += _4K;
        }

        System.out.println("Final price is: " + amount);


    }
}

/*

### Create a program that will build a custom computer by selecting each part and computing the total price.
Use the following requirements for each section:

**First ask the user about the screen size**
> Select screen size:
> - For a screen size of `13.3`, add `$200` to the total price
> - For a screen size of `15.0`, add `300` to the total price
> - For screen size of `17.3`, add `$400` to the total price

**Then ask the user about the CPU**
> Select CPU type:
> - For a CPU of `i3`, add `$150` to the total price
> - For a CPU of `i5`, add `$250` to the total price
> - For a CPU of `i7`, add `$350` to the total price

**Then ask the user about the RAM size**
> Select RAM size:
> - Add `$50` to the total price for every 4GB of ram. Assume the ram amounts will be divisible by 4

**Then ask the user about the storage type and amount**
> Select storage type:

> Select storage size:

> - For `HDD`, add `$50` to the total price for every 500GB
> - For `SSD`, add `$100` to the total price for every 500GB

**Then ask the user about the screen resolution**
> Select screen resolution:
> - For `FULLHD`, add `$100` to the total price
> - For `4K`, add `$200` to the total price

** At the end display the total price of the custom computer**
> Laptop price is: $amount

Main topics: conditional statements, primitive variables, operators, Scanner

**Example Flows:**

```
  Select screen size:
    13.3
  Select CPU type:
    i7
  Select RAM size:
    8
  Select storage type:
    SSD
  Select storage size:
    1000
  Select screen resolution:
    4K
  Final price is: $1050.0
```

```
  Select screen size:
    13.3
  Select CPU type:
    i3
  Select RAM size:
    4
  Select storage type:
    HDD
  Select storage size:
    500
  Select screen resolution:
    FULLHD
  Final price is: $550.0
```

 */
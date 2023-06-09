package statements;

import java.util.Scanner;

public class FindMiddleNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 = input.nextInt();

        System.out.println("Enter second number");
        int num2 = input.nextInt();

        System.out.println("Enter third number");
        int num3 = input.nextInt();

        String middle = "middle number is: " + num1;

        if ((num2 > num1 && num2 < num3) || (num2 < num1 && num2 > num3)) {
            middle = "middle number is: " + num2;
        } else if ((num3 > num1 && num3 < num2) || (num3 < num1 && num3 > num2)) {
            middle = "middle number is: " + num3;
        }

        System.out.println(middle);


    }


}

/*

### Using `if statements` and `Scanner` write a program that will read three number inputs. Then using those number determine which number is the middle number. Follow the exact flow from the examples below.

```
Hint:

1. Create an object of Scanner class.
2. Declare int 3 variables
3. Use Scanner to assign numbers from console into the variables
4. Use if statements to find the middle number
```

Main topics: if statements, primitive variables, operators, Scanner


**Example Flows:**

```
Enter first number:
14
Enter second number:
52
Enter third number:
25

middle number is: 25
```
```

Enter first number:
140
Enter second number:
34
Enter third number:
1
middle number is: 34
```

 */
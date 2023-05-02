package statements;

import java.util.Scanner;

public class DayOfWeek {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter day number:");
        int day = scan.nextInt();

        String dayName = "";

        switch (day) {

            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Not a valid day";

        }

        System.out.println(dayName);
    }
}


/*

### Use a `switch statement` to display the day of the week when given an `int` `day`.
If an invalid `day` is given print `Not a valid day`.

#### The starting day will be 1, as Monday and the ending day will be 7, as Sunday.

Main topics: switch statements, primitive variables

** Example Flows:**
```
Ex:
  Enter day number:
  1
  Monday
```
```
Ex:
  Enter day number:
  7
  Sunday
```
```
Ex:
  Enter day number:
  8
  Not a valid day
```

 */
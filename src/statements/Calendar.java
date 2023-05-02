package statements;

import java.util.Scanner;

public class Calendar {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter month number:");
        int monthNum = scan.nextInt();
        String monthName = "";

        switch (monthNum) {

            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "Jun";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "Invalid month number";
        }
        System.out.println(monthName);
    }
}

/*

### Use a `switch statement` to display the month name when given an `int` `monthNum`.
If an invalid `monthNum` is given print `Invalid month number`

Main topics: switch statements, primitive variables

** Example Flows:**
```
Ex:
  Enter month number:
  5
  May
```
```
Ex:
  Enter month number:
  1
  January
```
```
Ex:
  Enter month number:
  20
  Invalid month number
```

 */
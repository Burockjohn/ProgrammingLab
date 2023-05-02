package variableScanner;

import java.util.Scanner;

public class SecondsConvertor {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter seconds:");
        int inputSeconds = input.nextInt(),
                hours = inputSeconds / (60*60),
                minutes = (inputSeconds % 3600) / 60,
                seconds = inputSeconds - (hours*3600) - (minutes*60);

        System.out.println(hours + " hours, " + minutes + " minutes," + " and " + seconds + " seconds");





    }
}

/*

### Write a program that will take a number of seconds and converts it to a number of hours, minutes and seconds

- Create a `Scanner` object
- Declare four `int` variables: `inputSeconds, hours, minutes, seconds`
- Ask the user to enter the total number of seconds:

    > Enter seconds:

#### Taking the given number of total seconds calculate how many hours come from that many seconds,
then how many left over minutes can come from those seconds and finally how many leftover seconds there is.

**Hint:** Use `% (remainder)` and `/ operators` to calculate the hours, minutes, and seconds

```
Ex:

  Enter seconds:
    3695
  1 hours, 1 minutes, and 35 seconds
```

Main topics: variables, primitive datatypes, String, Scanner, concatenation, operators


 */

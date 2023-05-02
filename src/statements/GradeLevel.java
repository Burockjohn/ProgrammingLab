package statements;

public class GradeLevel {

    public static void main(String[] args) {

        int age = 5;
        String result;

        if (age >= 19 ) {
            result = "college";
        } else if (age >= 14 && age <= 18) {
            result = "high school";
        } else if (age >= 11 && age <= 13) {
            result = "middle school";
        } else if (age >= 6 && age <= 10) {
            result = "elementary school";
        } else if (age == 5) {
            result = "kindergarten";
        } else if (age >= 3 && age <= 4) {
            result = "preschool";
        } else {
            result = "ineligible";
        }

        System.out.println(result);


    }
}


/*

### Use `if statements` to help the student find out which grade level they will join based on their `age`.
Use the following information to determine the results:

```
less than 3   -> ineligible
3-4           -> preschool
5             -> kindergarten
6-10          -> elementary school
11-13         -> middle school
14-18         -> high school
19+           -> college
```

#### Hint: Use a multi branch if statement

Main topics: if statements, primitive variables, operators

```
Ex:
  Input:
    8

  Output:
    elementary
```
```
Ex:
  Input:
    5

  Output:
    kindergarten
```

 */
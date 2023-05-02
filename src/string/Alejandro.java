package string;

import java.util.Scanner;

public class Alejandro {

    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner s = new Scanner(System.in);
        String email = s.nextLine();

        //WRITE YOUR CODE BELOW

        boolean name1 = email.contains("Alejandro"),
                name2 = email.contains("alejandro"),
                project = email.contains("project");
        String result;

        if((name1 || name2) && project) {
            result = "priority";
        } else if ((name1 || name2)) {
            result = "read";
        } else {
            result = "don't read";
        }

        System.out.println(result);
    }

    }

/*

### Alejandro has many emails, but only has time to read a few of them. Help him sort his inbox by checking the given
`email` variable for his name and for the word 'project'. Use the following requirements to help Alejandro:

> - If the email has his name and the word 'project' print: `priority`
> - If the email has only his name, but not the word 'project' print: `read`
> - If the email does not have his name print: `don't read`

#### Note: Case sensitivity for his name doesn't matter, we always want to read the email if his name is there,
but there is no difference between the uppercase or lowercase letter. This must be handling by your filtering.

Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation, if statements, operators

```
Ex:
  Input:
    dear Alejandro.....a lot of text

  Output:
    read
```
```
Ex:
  Input:
    thunder blaz is the best drink in the galaxy...

  Output:
    don't read
```
```
Ex:
  Input:
    subject : important project, alejandro we need you for this...

  Output:
    priority
```

 */
package string;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.next();


        String firstName = email.substring(0, email.indexOf("_")).toUpperCase();
        char first_initial = firstName.charAt(0);
        String rest_of_first = firstName.substring(1).toLowerCase();
        firstName = first_initial + rest_of_first;

        String lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@")).toUpperCase();
        char second_initial = lastName.charAt(0);
        String rest_of_second = lastName.substring(1).toLowerCase();
        lastName = second_initial + rest_of_second;

                                        //burak_can@turktelekom.com.tr
        String domain = email.substring(email.indexOf("@") + 1,email.indexOf(".")).toUpperCase();
        char domain_initial = domain.charAt(0);
        String rest_of_domain = domain.substring(1).toLowerCase();
        domain = domain_initial + rest_of_domain;

        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Domain: " + domain);
    }


}

/*

### Use `String methods` to divide the given `email` into separate parts. The email will always be in this format:

#### firstName_lastName@domain.com

Pull apart and print the first name, last name, and domain. When printing the values all three should be in
proper capitalization format - The first letter of each word is uppercase and the rest are lowercase.
Output in the following format:

```
First name: $first name
Last name: $last name
Domain: $domain
```

#### Hint: Think about how to use substring and indexOf together

Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation

```
Ex:
  Input:
    jeff_bezos@amazon.us

  Output:
    First name: Jeff
    Last name: Bezos
    Domain: Amazon
```
```
Ex:
  Input:
    sergey_brin@gmail.com

  Output:
    First name: Sergey
    Last name: Brin
    Domain: Gmail
```


 */
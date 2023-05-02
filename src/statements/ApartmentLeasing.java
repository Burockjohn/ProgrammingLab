package statements;

import java.util.*;

public class ApartmentLeasing {

    public static void main(String[] args) {

        //DO NOT TOUCH BELOW:
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Cydeo Apartments!");
        System.out.println("How many bedrooms are you looking for?");
        int numberOfBedrooms = scan.nextInt();

        //WRITE YOUR CODE HERE:

        String result;
        int bedroom1 = 1100,
                bedroom2 = 1850,
                bedroom3 = 2550;

        if (numberOfBedrooms > 0 && numberOfBedrooms <= 3){
            if (numberOfBedrooms == 1){
                result = "One Bedroom Selected" + "\nStarting Price: " + bedroom1;
            } else if (numberOfBedrooms == 2) {
                result = "Two Bedroom Selected" + "\nStarting Price: " + bedroom2;
            } else {
                result = "Three Bedroom Selected" + "\nStarting Price: " + bedroom3;
            }

        } else {
            result = "Sorry, we do not offer that many bedrooms";
        }
        System.out.println(result);


    }


}

/*
### Use `if statements` to find the cost of leasing an apartment based on the number of bedrooms.
Use the `numberOfBedrooms` variable and these rates to get the final price:

> - 1 bedroom: 1100
> - 2 bedroom: 1850
> - 3 bedroom: 2550

#### Note: If an invalid bedroom number is given no price is displayed

#### Note: Can use multiple if statements or a multi branch if statement

Main topics: if statements, primitive variables, concatenation, operators

**Example Flows:**
```
Welcome to Cydeo Apartments!
How many bedrooms are you looking for?
1
One Bedroom Selected
Starting Price: 1100
```

```
Welcome to Cydeo Apartments!
How many bedrooms are you looking for?
3
Three Bedroom Selected
Starting Price: 2550
```

```
Welcome to Cydeo Apartments!
How many bedrooms are you looking for?
5
Sorry, we do not offer that many bedrooms

```

 */

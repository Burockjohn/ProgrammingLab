package statements;

import java.util.Scanner;

public class GiftCard {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hello, which item would you like?");
        String answer = input.next();

        String paid = "Thank you for your purchase!",
                not_enough = "Sorry, not enough funds on your gift card",
                invalid = "Sorry, that is an invalid item",
                current_balance = "Your current balance is: ";

        int current = 100;

        int gift = 100,
                blanket = 60,
                charger = 5,
                hat = 25,
                headphone = 30,
                laptop = 200,
                pants = 50,
                pillow = 40,
                smartphone = 1000,
                socks = 5,
                usb_cable = 10;

        switch (answer) {
            case "Blanket":
                if (gift >= blanket) {
                    System.out.println(paid);
                    System.out.println(current_balance + (gift - blanket));
                } else {
                    System.out.println(not_enough);
                }
                break;
            case "Charger":
                if (gift >= charger) {
                    System.out.println(paid);
                    System.out.println(current_balance + (gift - charger));
                } else {
                    System.out.println(not_enough);
                }
                break;
            case "Hat":
                if (gift >= hat) {
                    System.out.println(paid);
                    System.out.println(current_balance + (gift - hat));
                } else {
                    System.out.println(not_enough);
                } break;
            case "Laptop":
                if(gift >= laptop) {
                    System.out.println(paid);
                    System.out.println(current_balance + (gift - laptop));
                } else {
                    System.out.println(not_enough);}
                break;
            case "Pants":
                if(gift >= pants) {
                    System.out.println(paid);
                    System.out.println(current_balance + (gift - pants));
                } else {
                    System.out.println(not_enough);}
                break;
            case "Pillow":
                if(gift >= pillow) {
                    System.out.println(paid);
                    System.out.println(current_balance + (gift - pillow));
                } else {
                    System.out.println(not_enough);}
                break;
            case "Smartphone":
                if(gift >= smartphone) {
                    System.out.println(paid);
                    System.out.println(current_balance + (gift - smartphone));
                } else {
                    System.out.println(not_enough);}
                break;
            case "Headphone":
                if(gift >= headphone) {
                    System.out.println(paid);
                    System.out.println(current_balance + (gift - headphone));
                } else {
                    System.out.println(not_enough);}
                break;
            case "Socks":
                if(gift >= socks) {
                    System.out.println(paid);
                    System.out.println(current_balance + (gift - socks));
                } else {
                    System.out.println(not_enough);}
                break;
            case "USB cable":
                if(gift >= usb_cable) {
                    System.out.println(paid);
                    System.out.println(current_balance + (gift - usb_cable));
                } else {
                    System.out.println(not_enough);}
                break;
            default:
                System.out.println(invalid);

        }
    }
}

/*

### You got a $100 gift card for your birthday, but we can't use it yet.
We need to build the application for the store in order to use our gift card.

#### The program will ask the user to enter the item they want to buy.
Then it will check if that item is in the store inventory. If the item is available there will be a confirmation message
displayed and the remaining balance on the gift card will be output as well. In some cases that item may not be available
in the store and in other cases we may not have enough money on the gift card to buy an item so we must handle both of
these conditions as well. We can only make one purchase at a time.

** List of items, with prices, available in the store:**

> - Blanket: $60
> - Charger: $5
> - Hat: $25
> - Headphones: $30
> - Laptop: $200
> - Pants: $50
> - Pillow: $40
> - Smartphone: $1000
> - Socks: $5
> - USB cable: $10

- If the item is not in the list, display message: `Sorry, that is an invalid item`
- If the price of the item we want is more than $100, display message: `Sorry, not enough funds on your gift card`

#### Hint: Use a switch statement to avoid having to compare String values in if statements.
Don't forget to create your Scanner object.

Main topics: switch statements, primitive variables, operators, Scanner

**Example Flows:**

```
  Hello, which item would you like?
  Hat
  Thank you for your purchase!
  Your current balance is: 75$
```

```
  Hello, which item would you like?
  Pants
  Thank you for your purchase!
  Your current balance is: 50$
```

```
  Hello, which item would you like?
  Laptop
  Sorry, not enough funds on your gift card
```

```
  Hello, which item would you like?
  Cupcake
  Sorry, that is an invalid item
```

 */
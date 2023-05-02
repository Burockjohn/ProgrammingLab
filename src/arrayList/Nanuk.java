package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Nanuk {

    public static boolean hunt(ArrayList<String> result, int wayStones, int boast) {

        int totalHunt = 0;
        int counterNanuk = 0;

        for (String each : result) {

            if (Character.isDigit(each.charAt(0))) {
                totalHunt += Integer.parseInt(each);
            } else if (each.equals("nanuk")) counterNanuk++;

        }

        return (wayStones >= counterNanuk) && (totalHunt >= boast);


    }

    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int stones = in.nextInt();
        int boast = in.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(in.next());
        }

        System.out.println(hunt(list, stones, boast));

    }

}

/*

### In the Eskimo language `nanuk` means _polar bear._ When the tribe men go hunting they need to select a leader, each men boasts on how many fish,
 elk or other animals he can hunt. Then they vote who will lead them. A successful hunt for the leader is when they managed to hunt _as much as
 he boasted_ and the hunting party managed to avoid a polar bear (_nanuk_) which can ruin a whole hunt. Experienced hunters know ways to avoid
 polar bears using way stones to mark these areas.

### Finish the method called `hunt()` that will take three arguments: an `ArrayList<String>` `result`, `int` `wayStones` and `int` `boast`.
The method returns a boolean, about if the hunt was successful or not. Use the guidelines below to determine if a hunt was successful or not.
The `hunt()` method is already called in the main method with an argument.

> The `results` will show either the number of catches on that path or nanuk
>
> The `wayStones` is the number of safe paths the leader knows to avoid nanuks. Each wayStone will help to avoid one nanuk and cannot be used for
future ones
>
> The `boast` is how much food the leader said he would be able to hunt.

> Return `true` when the hunt was successful: if hunters had enough `wayStones` to avoid all nanuks they returned from the hunt with a hunt number
more or equal to the `boast` number for the leader
>
> Return `false` if hunters encountered nanuk but did not have a wayStone to avoid it, or if the total catches on the hunt was less than
the `boast` amount

#### This is a `return` method with an `ArrayList<String>` and two `int` parameters

Main topics: methods, Scanner, ArrayList, wrapper classes

Example:
```
	nanuk(["1","2","3","5"],0,5)

output:
	true
	(no nanuks, and catches are 11 which is more than 5 that leader boasted)
```
Example:
```
	nanuk(["1","nanuk","3","5"],0,5)

output:
	false
	(They encountered nanuk but had 0 way stones)
```
Example:
```
	nanuk(["1","3"],0,5)

output:
	false
```
Example:
```
	nanuk(["1","10","3","nanuk"],2,7)

output:
	true
```
Example:
```
	nanuk(["1","10","3","nanuk","nanuk"],2,7)

output:
	true
```

Example:
```
	nanuk(["1","10","3","nanuk","nanuk","nanuk"],2,7)

output:
	false
```

 */

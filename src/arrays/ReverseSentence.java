package arrays;

import java.util.Scanner;

public class ReverseSentence {

    public static void main(String[] args) {

        // DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        // TYPE YOUR CODE BELOW:

        String str[] = sentence.split(" ");
        String result = "";

        for (int i = str.length - 1; i >= 0; i--) {
            result += str[i] + " ";
        }

        System.out.println(result.trim());


    }

}
/*

### Given a `String` `sentence` print a version with the words reversed. The order of the words is changed, not the letters.

Hint: Think about what comes between each word in the sentence

Main topics: arrays, String, concatenation, index, primitive dataypes

Example:
```
Input:
  Java is fun

Output:
  fun is Java
```

Example:
```
Input:
  Hello! How are you?

Output:
  you? are How Hello!
```

 */
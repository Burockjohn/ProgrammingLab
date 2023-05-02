package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ShortestWord {

    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        //WRITE YOUR CODE BELOW

        String words[] = str.split(", ");
        int shortest = Integer.MAX_VALUE;

        for (String word : words) {
            if (word.length() < shortest) shortest = word.length();
        }

        String[] shortestWords = new String[words.length];
        int count = 0;

        for (String word : words) {
            if (word.length() == shortest) {
                shortestWords[count++] = word;
            }
        }

        shortestWords = Arrays.copyOf(shortestWords, count);
        System.out.println(Arrays.toString(shortestWords));


    }

}

/*

### Given a `String` `str`, find and print the shortest words. The `String` will have multiple words separated by commas and spaces.
 If there is words that have the same length, they should all be displayed at the end. Print all the shortest words in the following format:

> Input: word1, word2, word3, word4, etc...

> Output: [short1, short2, short3, etc...]

Hint: Think about what comes between each word in the sentence

Main topics: arrays, String, loops, if statements, primitive datatypes, operators

Example:
```
Input:
  olive, fish, pursuit, old, warning, python, java, coffee, cat, ray

Output:
  [old, cat, ray]
```

 */

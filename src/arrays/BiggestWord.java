package arrays;

import java.util.Scanner;

public class BiggestWord {

    public static void main(String[] args) {

        //DO NOT TOUCH BELOW
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for (int i = 0; i < 5; i++) {
            words[i] = input.nextLine();
        }
        //WRITE YOUR CODE BELOW


        String biggest = words[0];

        for (String word : words) {
            if (word.length() > biggest.length()) biggest = word;
        }

        System.out.println(biggest);


    }
}

/*

### Given a `String []` `words`, find and print the longest word in the array. You can assume the elements will have different lengths.

#### Note: The loop used in the given code is to dynamically create the String array. You don't need to fully understand this part yet, focus only on having access to an array.

Main topics: arrays, primitive datatypes, concatenation, index, operators. loops, if statement, String

Example:
```
Input:
  [aaa, bbbbb, whasstupppp, longg, jaaaaavvaaaaaaaaaa]

Output:
  jaaaaavvaaaaaaaaaa
```
Example:
```
Input:
  [five5, six666, one1111111111111, 2two, four4444]

Output:
  one1111111111111
```

 */
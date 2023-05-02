package methods;

import java.util.Scanner;

public class EachCharacter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(countLetters(in.next()));
    }

    public static String countLetters(String str){

        String result = "";

        for(int i=0; i<str.length();i++){ // opendoor
            int counter =0;
            for(int j=0; j<str.length();j++){ // opendoor
                if(str.charAt(i) == str.charAt(j)) counter++;
            }

            if(!result.contains(""+str.charAt(i)))
            result += "" + counter + str.charAt(i);
        }

        return result;



    }

}

/*

### Finish the method called `countLetters()` that will take a `String` argument `str` and returns a `String`.
Find the frequency of each character in `str` and concatenate the frequency number with the character.
Return the concatenated String with all the frequencies. The `countLetters()` method is already called in the main method with an argument.

#### This is a `return` method with a `String` parameter

Concatenated String should be in this format:
> frequency number + letter

Main topics: methods, Scanner, String, loops

Example:
```
	countLetters("aaabbcccc");

output:
	3a2b4c
```
Example:
```
	countLetters("appleeess");

output:
	1a2p1l3e2s
```

 */
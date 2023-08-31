import java.util.Arrays;
import java.util.stream.Collectors;

public class TwoToOne {
    /*\
    Take 2 strings s1 and s2 including only letters from a to z. Return a new sorted string,
     the longest possible, containing distinct letters - each taken only once - coming from s1 or s2.
Examples:

a = "xyaabbbccccdefww"
b = "xxxxyyyyabklmopq"
longest(a, b) -> "abcdefklmopqwxy"

a = "abcdefghijklmnopqrstuvwxyz"
longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"


     */

    public static String longest (String s1, String s2) {
        // your code
        String newString = s1+s2;
        String sortedArr = Arrays.stream(newString.split("")).distinct().sorted().collect(Collectors.joining());

        return sortedArr;
    }
}

import java.util.Arrays;

public class DescendingOrder {
    /*
    Your task is to make a function that can take any non-negative integer
     as an argument and return it with its digits in descending order.
     Essentially, rearrange the digits to create the highest possible number.
Examples:

Input: 42145 Output: 54421

Input: 145263 Output: 654321

Input: 123456789 Output: 987654321

     */

    public static int sortDesc(final int num) {

        String something = String.valueOf(num);
        int[] numbers = new int[something.length()];
        for (int i = 0; i < something.length(); i++) {
            int digit = Character.getNumericValue(something.charAt(i));
            numbers[i] = digit;
            Arrays.sort(numbers);

        }
        StringBuilder reversed = new StringBuilder();
        for(int i =numbers.length-1; i>=0;i--){
            reversed.append(numbers[i]);
        }
        int sm = Integer.parseInt(reversed.toString());
        return sm;
    }

}

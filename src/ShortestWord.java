public class ShortestWord {
    /*
    Simple, given a string of words, return the length of the shortest word(s).

String will never be empty and you do not need to account for different data types.

     */
    public static int findShort(String s) {
        String[] words = s.split(" ");
        int shortestLenght = Integer.MAX_VALUE;

        for (String word : words) {
            int lenght = word.length();
            if (lenght < shortestLenght) {
                shortestLenght = lenght;
            }

        }
        return shortestLenght;
    }

}

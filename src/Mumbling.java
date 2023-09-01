public class Mumbling {
    public static String accum(String s) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i<s.length();i++){
            char currentCHar = s.charAt(i);
            result.append(Character.toUpperCase(currentCHar));

            for(int j = 0; j<i;j++){
                result.append(Character.toLowerCase(currentCHar));
            }
            if(i<s.length()-1){
                result.append("-");
            }

        }return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(accum("abcd"));
    }
}

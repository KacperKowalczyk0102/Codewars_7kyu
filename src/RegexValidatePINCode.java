public class RegexValidatePINCode {
    /*
    ATMs allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.

If the function is passed a valid PIN string, return true, else return false.
Examples (Input --> Output)

"1234"   -->  true
"12345"  -->  false
"a234"   -->  false


     */
    public static boolean validatePin(String pin) {
        for(char c : pin.toCharArray()){
            if(!Character.isDigit(c)){
                return false;
            }
        }
        if (pin.length() == 4 || pin.length() == 6) {
            return true;
        } else {
            return false;
        }

    }

}

public class Kata {
    public static String rot13(String str) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz",
                bigAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
                symbols = " 1234567890'`~!@#$%^&*()_+№;:?-=<>,./{}[]\\№\"|";

        String newStr = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < symbols.length(); j++) {
                if (str.charAt(i) == symbols.charAt(j)) {
                    newStr += symbols.charAt(j);
                    break;
                }
            }

            if (Character.isUpperCase(str.charAt(i))) {
                newStr += alpha(bigAlphabet, str, i);
            }
            else {
                newStr += alpha(alphabet, str, i);
            }
        }

        return newStr;
    }

    public static String alpha(String a, String str, int i) {
        for (int j = 0; j < a.length(); j++) {
            if (str.charAt(i) == a.charAt(j)) {
                if (j + 13 >= a.length()) {
                    return String.valueOf(a.charAt(13 - (a.length() - j)));
                } else {
                    return String.valueOf(a.charAt(j + 13));
                }
            }
        }

        return "";
    }
}
public class Solution {
    public static String[] stringToArray(String s) {
        int counter = 1;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == ' ') {
                counter++;
            }
        }
        String[] str = new String[counter];

        s += " ";
        int j = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == ' ') {
                str[j++] = s.substring(0, i);
                s = s.substring(i + 1, s.length());
                i = 0;
            }
            if (s == "") {
                break;
            }
        }

        return str;
    }
}
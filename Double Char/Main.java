public class Solution{
    public static String doubleChar(String s){
        String str = "";

        for (int i = 0; i < s.length(); i++) {
            str += s.charAt(i);
            str += s.charAt(i);
        }

        return str;
    }
}
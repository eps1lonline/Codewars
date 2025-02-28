public class StringSplit {
    public static String[] solution(String s) {
        String[] str;
        if (s.length() % 2 == 1) {
            str = new String[(s.length() + 1) / 2];
        }
        else {
            str = new String[s.length() / 2];
        }

        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            str[j] = String.valueOf(s.charAt(i++));
            if (s.length() % 2 == 1 && i == s.length()) {
                str[j++] += "_";
                break;
            }
            str[j++] += String.valueOf(s.charAt(i));
        }

        return str;
    }
}
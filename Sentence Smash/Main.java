import java.util.Arrays;

public class SmashWords {
    public static String smash(String... words) {
        String str = "";

        for (int i = 0; i < words.length; i++) {
            str += words[i] + " ";
        }
        if (str.length() != 0) {
            str = str.substring(0, str.length() - 1);
        }

        return str;
    }
}
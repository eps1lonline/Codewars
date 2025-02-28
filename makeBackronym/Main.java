import java.util.*;
import java.util.stream.*;

public class Backronym {
    private static Map<String, String> dictionary = Preload.dictionary;

    public static String makeBackronym(String acronym) {
        String str = "",
                alphabet = "abcdefghijklmnopqrstuvwxyz",
                bigAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int i = 0; i < acronym.length(); i++)
            str += alphabet.indexOf(acronym.charAt(i)) == -1 ? dictionary.get(String.valueOf(acronym.charAt(i))) + " "
                    : dictionary.get(String.valueOf(bigAlphabet.charAt(alphabet.indexOf(acronym.charAt(i))))) + " ";

        return str.length() == 0 ? "" : str.substring(0, str.length() - 1);
    }
}
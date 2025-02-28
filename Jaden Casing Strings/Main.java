public class JadenCase {
    public static String toJadenCase(String phrase) {
        if (phrase == null || phrase == "")
            return null;

        String result = "",
                alphabet = "abcdefghijklmnopqrstuvwxyz",
                bigAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        phrase += " ";
        while (phrase.length() != 0) {
            result += bigAlphabet.charAt(alphabet.indexOf(phrase.charAt(0))) + phrase.substring(1, phrase.indexOf(" ")) + " ";
            phrase = phrase.substring(phrase.indexOf(" ") + 1, phrase.length());
        }

        return result.substring(0, result.length() - 1);
    }
}
public class XO {
    public static boolean getXO (String str) {
        if (str.indexOf("x") == -1 || str.indexOf("X") == -1)
            if (str.indexOf("o") == -1 || str.indexOf("O") == -1)
                return true;

        int countX = 0,
                countO = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'o' || str.charAt(i) == 'O')
                countO++;
            else
                countX++;
        }

        if (countX != countO)
            return false;
        return true;
    }
}
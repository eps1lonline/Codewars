public class Kata {
    public static String stringy(int size) {
        String string = "";

        for (int i = 0; i < size; ++i) {
            if (i % 2 == 1) {
                string += "0";
            }
            else {
                string += "1";
            }
        }

        return string;
    }
}
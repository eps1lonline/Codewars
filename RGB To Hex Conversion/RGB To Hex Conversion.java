public class RgbToHex {
    public static String rgb(int r, int g, int b) {
        String result = "";
        result += convert(r);
        result += convert(g);
        result += convert(b);

        return result;
    }

    public static String convert(int p) {
        String[] m = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        if (p > 255) {
            return "FF";
        }
        else if (p < 0) {
            return "00";
        }
        else {
            return m[p / 16] + m[p - ((p / 16) * 16)];
        }
    }
}
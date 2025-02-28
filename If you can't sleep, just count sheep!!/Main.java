class Kata {
    public static String countingSheep(int num) {
        if (num <= 0) {
            return "";
        }
        else {
            String str = "";
            for (int i = 1; i <= num; ++i) {
                str += i + " sheep...";
            }

            return str;
        }
    }
}
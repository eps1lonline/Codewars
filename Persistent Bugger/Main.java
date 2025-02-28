class Persist {
    public static int persistence(long n) {
        int result = 1,
                counter = 0;
        String str = String.valueOf(n);

        while (str.length() != 1) {
            result = 1;

            for (int i = 0; i < str.length(); i++)
                result *= Integer.parseInt(String.valueOf(str.charAt(i)));

            str = String.valueOf(result);
            counter++;
        }

        return counter;
    }
}
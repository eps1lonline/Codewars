public class Kata {
    public static int[] digitize(long n) {
        int[] arr = new int[String.valueOf(n).length()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (n % 10);
            n /= 10;
        }

        return arr;
    }
}
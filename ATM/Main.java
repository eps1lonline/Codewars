public class ATM {
    public static int solve(int n) {
        int counter = 0;
        for (int i : new int[] {500, 200, 100, 50, 20, 10})
            while (n - i >= 0) {
                counter++;
                n -= i;
            }
        if (n != 0)
            return -1;
        return counter;
    }
}
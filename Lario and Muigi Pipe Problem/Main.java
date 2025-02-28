public class Kata {
    public static int[] pipeFix(int[] numbers) {
        int min = numbers[0];
        int max = numbers[numbers.length - 1];

        if (min <= 0) {
            numbers = new int[max + Math.abs(min) + 1];
        }
        else {
            numbers = new int[max - min + 1];
        }

        int j = 0;
        for (int i = min; i <= max; ++i) {
            numbers[j++] = i;
        }
        return numbers;
    }
}
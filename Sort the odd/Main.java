import java.util.*;

public class Kata {
    public static int[] sortArray(int[] arr) {
        int counter = 0;

        for (int i = 0; i < arr.length; i++)
            if (arr[i] % 2 == 0 || arr[i] == 0)
                counter++;

        int j = 0;
        int[] oddArr = new int[arr.length - counter];

        for (int i = 0; i < arr.length; i++)
            if (arr[i] % 2 == 1 )
                oddArr[j++] = arr[i];

        Arrays.sort(oddArr);
        j = 0;

        for (int i = 0; i < arr.length; i++)
            if (arr[i] % 2 == 1)
                arr[i] = oddArr[j++];

        return arr;
    }
}
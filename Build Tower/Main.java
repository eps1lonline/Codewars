public class Kata {
    public static String[] towerBuilder(int nFloors) {
        int k = 1;
        String[] arr = new String[nFloors];

        for (int i = 0; i < nFloors; i++) {
            arr[i] = "";

            for (int j = 0; j < nFloors - i - 1; j++)
                arr[i] += " ";

            for (int j = 0; j < k; j++)
                arr[i] += "*";

            for (int j = 0; j < nFloors - i - 1; j++)
                arr[i] += " ";

            k += 2;
        }

        return arr;
    }
}
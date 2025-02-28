public class Kata {
    public static int[] flip(char dir, int[] arr) {
        boolean isSort = false;

        if (dir == 'R') {
            while (!isSort) {
                isSort = true;

                for (int i = 0; i < arr.length - 1; i++) {
                    if (arr[i] > arr[i + 1]) {
                        isSort = false;

                        int temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                    }
                }
            }
        }
        else {
            while (!isSort) {
                isSort = true;

                for (int i = 0; i < arr.length - 1; i++) {
                    if (arr[i] < arr[i + 1]) {
                        isSort = false;

                        int temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                    }
                }
            }
        }

        return arr;
    }
}
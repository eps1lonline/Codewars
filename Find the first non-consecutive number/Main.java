class FirstNonConsecutive {
    static Integer find(final int[] array) {
        int min = array[0];
        int max = array[array.length - 1];

        int j = 0;
        for (int i = min; i <= max; i++) {
            if (array[j++] != i) {
                return (i + 1);
            }
        }

        return null;
    }
}
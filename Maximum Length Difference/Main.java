class MaxDiffLength {
    public static int mxdiflg(String[] a1, String[] a2) {
        if (a1.length == 0 || a2.length == 0) {
            return -1;
        }

        int max = 0;

        for (String i : a2) {
            for (String j : a1) {
                if (Math.abs(i.length() - j.length()) > max) {
                    max = Math.abs(i.length() - j.length());
                }
            }
        }

        return max;
    }
}
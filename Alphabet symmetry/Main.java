public class Solution{
    public static int[] solve(String[] arr){
        String alphabet_1 = "abcdefghijklmnopqrstuvwxyz",
                alphabet_2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int counter = 0,
                k = 0;
        int[] mass = new int[arr.length];

        for (String i : arr) {
            for (int j = 0; j < ((i.length() < 26) ? i.length() : 26); j++) {
                if (i.charAt(j) == alphabet_1.charAt(j) || i.charAt(j) == alphabet_2.charAt(j)) {
                    counter++;
                }
            }

            mass[k++] = counter;
            counter = 0;
        }

        return mass;
    }
}
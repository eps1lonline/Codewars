public class Kata {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int medium = 0;
        for (int i = 0; i < classPoints.length; i++) {
            medium += classPoints[i];
        }
        medium /= classPoints.length;
        return yourPoints > medium;
    }
}
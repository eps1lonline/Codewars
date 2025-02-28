public class CuboidVolumes {
    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
        int v1 = 1, v2 = 1;

        for (int i : firstCuboid) {
            v1 *= i;
        }
        for (int i : secondCuboid) {
            v2 *= i;
        }

        return (v1 > v2) ? v1-v2 : v2-v1;
    }
}
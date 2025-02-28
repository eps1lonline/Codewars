package cw;

public class Reflections {
    public static int[] reflectPoint(int[] p, int[] q) {
        int[] cord = new int[2];
        cord[0] = q[0] - p[0] + q[0];
        cord[1] = q[1] - p[1] + q[1];
        return cord;
    }
}
import java.util.*;
public class SortByBinaryOnes{
    public static Integer[] sort(Integer list[]) {
        Arrays.sort(list, new Comparator<Integer>() {
            public int compare(Integer s1, Integer s2) {
                return Integer.bitCount(s1) > Integer.bitCount(s2) ? -1 : Integer.bitCount(s1) < Integer.bitCount(s2) ? 1 : Integer.compare(s1, s2);
            }
        });

        return list;
    }
}
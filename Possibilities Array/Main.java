import java.util.*;
public class Solution {
    public static boolean isAllPossibilities(int[] arg) {
        if (arg.length == 0)
            return false;

        Arrays.sort(arg);

        for (int i = 0; i < arg.length; i++)
            if (arg[i] != i)
                return false;

        return true;
    }
}
public class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int len = colors.length + k - 1;
        int[] totalColor = new int[len];
        
        for (int i = 0; i < colors.length; i++) {
            totalColor[i] = colors[i];
        }
        for (int i = 0; i < k - 1; i++) {
            totalColor[colors.length + i] = colors[i];
        }

        int result = 0;
        int lft = 0;
        int ryt = 1;

        while (ryt < len) {
            if (totalColor[ryt] == totalColor[ryt - 1]) {
                lft = ryt;
                ryt++;
                continue;
            }

            ryt++;

            if (ryt - lft < k)
                continue;

            result++;
            lft++;
        }

        return result;
    }
}
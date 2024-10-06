import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        int dp[][] = new int[numRows][numRows];

        for (int l = 0; l < numRows; l++) {
            List<Integer> row = new ArrayList<>();
            for (int i = 0; i <= l; i++) {
                if (l == i || i == 0) {
                    dp[l][i] = 1;
                } else {
                    dp[l][i] = dp[l - 1][i - 1] + dp[l - 1][i];
                }
                row.add(dp[l][i]);  
                System.out.print(dp[l][i] + " ");  
            }
            System.out.println();  
            result.add(row);  
        }
        return result;
    }
}

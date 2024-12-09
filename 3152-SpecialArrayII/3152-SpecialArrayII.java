class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = nums.length;
        int m = queries.length;
        int[] prefix = new int[n];
        boolean[] ans = new boolean[m];
        prefix[0] = 0;
        for(int i = 1;i<n;i++)
        {
            if(nums[i] % 2 == nums[i -1]%2)
            {
                prefix[i] = prefix[i - 1]+1;
            }
            else
            {
                prefix[i] = prefix[i - 1];
            }
        }
        for(int i = 0;i<m;i++)
        {
            int s = queries[i][0];
            int e = queries[i][1];
            ans[i] = (prefix[s] == prefix[e]);
        }
        return ans;
        

    }
}
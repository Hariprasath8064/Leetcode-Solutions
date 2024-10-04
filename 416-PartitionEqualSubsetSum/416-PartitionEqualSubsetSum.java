class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i = 0;i<n;i++)
        {
            sum = sum + nums[i];
        }
        
        if (sum % 2 != 0)
        {
            return false;
        }
       int dp[][] = new int [n+1][sum+1];
        for (int i=0;i<n+1;i++)
        {
            for(int j=0;j<sum+1;j++)
            {
                dp[i][j] = -1;
            }
        }
        if (subsetsum(nums, sum/2,n,dp) == 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    static int subsetsum(int[] arr,int sum,int n, int dp[][])
    {
        if(sum == 0)
        {
            return 1;
        }
        else if(n == 0)
        {
            return 0;
        }
        
        if(dp[n][sum] != -1)
        {
            return dp[n][sum];
        }
        
        if(arr[n-1] > sum)
        {
            return dp[n][sum] = subsetsum(arr , sum , n-1,dp);
        }
        else
        {
            if(subsetsum(arr,sum - arr[n-1],n-1,dp)!=0 || subsetsum(arr,sum,n-1,dp) != 0)
            {
                return dp[n][sum] = 1;
            }
            else
            {
                return dp[n][sum] = 0;
            }
        }
    }
}
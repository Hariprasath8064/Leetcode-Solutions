// Last updated: 12/5/2025, 6:09:38 PM
1class Solution {
2    public int[] shuffle(int[] nums, int n) {
3        int ans[] = new int [ 2* n ];
4        for(int i = 0 ; i < n;i++){
5            ans[2*i]= nums[i];
6            ans[2* i+ 1] = nums[i + n];
7        }
8        return ans;
9    }
10}
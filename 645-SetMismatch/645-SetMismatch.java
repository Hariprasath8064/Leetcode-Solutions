// Last updated: 12/7/2025, 11:18:12 PM
1class Solution {
2    public int[] smallerNumbersThanCurrent(int[] nums) {
3        int n = nums.length;
4        int[] ans = new int[n];
5
6        for (int i = 0; i < n; i++) {
7            int count = 0;
8
9            for (int j = 0; j < n; j++) {
10                if (nums[j] < nums[i]) {
11                    count++;
12                }
13            }
14
15            ans[i] = count;
16        }
17
18        return ans;
19    }
20}
21
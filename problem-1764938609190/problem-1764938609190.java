// Last updated: 12/5/2025, 6:13:29 PM
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int max = 0;
4        int cur = 0;
5        for (int i = 0; i< nums.length;i++){
6            if(nums[i] == 1){
7                cur += 1;
8            }
9            else{
10                max = Math.max(max,cur);
11                cur = 0;
12            }
13        }
14        max = Math.max(cur,max);
15        return max;
16    }
17}
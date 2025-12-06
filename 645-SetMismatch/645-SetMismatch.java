// Last updated: 12/6/2025, 11:00:16 PM
1class Solution {
2    public int[] findErrorNums(int[] nums) {
3        int n = nums.length;
4        int ans[] = new int[2];
5        ArrayList<Integer> list = new ArrayList<>();
6        for(int i = 1;i<=n;i++){
7            list.add(i);
8        }
9        Arrays.sort(nums);
10        for(int i = 0;i < n;i++){
11            if(i < n-1 && nums[i] == nums[i+1]){
12                ans[0] = nums[i];
13            }
14            list.remove(Integer.valueOf(nums[i]));
15        }
16        ans[1] = list.get(0);
17        return ans;
18    }
19}
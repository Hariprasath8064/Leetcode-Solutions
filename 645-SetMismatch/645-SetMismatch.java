// Last updated: 12/10/2025, 3:19:18 PM
1class Solution {
2    public List<Integer> findDisappearedNumbers(int[] nums) {
3        HashSet<Integer> set = new HashSet<>();
4        ArrayList<Integer> ans = new ArrayList<>();
5        for(int i: nums){
6            set.add(i);
7        }
8        for(int i = 1; i<= nums.length;i++){
9            if(!set.contains(i)){
10                ans.add(i);
11            }
12        }
13        return ans;
14    }
15}
// Last updated: 12/10/2025, 3:53:38 PM
1class Solution {
2    public List<String> buildArray(int[] target, int n) {
3        List<String> ans = new ArrayList<>();
4        int initial = 1;
5        for( int i : target){
6            while(initial < i){
7                ans.add("Push");
8                ans.add("Pop");
9                initial++;
10            }
11            ans.add("Push");
12            initial++;
13        }
14        return ans;
15    }
16}
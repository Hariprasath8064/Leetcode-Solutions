// Last updated: 9/6/2025, 2:08:17 AM
class Solution {
    public int maxPower(String s) {
        char[] chars = s.toCharArray();
        int max = 1;
        int cur = 1;
        for(int i = 1 ;i < s.length();i++){
            if(s.charAt(i) == s.charAt(i - 1)){
                cur++;
                max = Math.max(max,cur);
            }
            else{
                cur = 1;
            }
        }
        return max;
    }
}
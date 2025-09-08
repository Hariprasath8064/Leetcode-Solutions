// Last updated: 9/8/2025, 9:12:32 AM
class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+ 1);
        }
        for(int n : map.keySet()){
            if (map.get(n) > 2){
                return false;
            }
        }
        return true;
    }
}
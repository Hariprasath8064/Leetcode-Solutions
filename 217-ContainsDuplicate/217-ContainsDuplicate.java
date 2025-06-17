// Last updated: 6/17/2025, 9:04:10 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0) + 1);
        }
        for(int count : map.values()){
            if(count > 1){
                return true;
            }
        }

        return false;
        
    }
}
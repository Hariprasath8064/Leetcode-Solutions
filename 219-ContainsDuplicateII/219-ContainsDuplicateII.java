class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();

        if(k == 0) return false;

        for(int i = 0; i<nums.length;i++)
        {
            int integer = nums[i];
            if(map.containsKey(integer) && i - map.get(integer) <= k)
            {
                return true;
            }
            map.put(integer,i);
        }

        return false;
        
    }
}
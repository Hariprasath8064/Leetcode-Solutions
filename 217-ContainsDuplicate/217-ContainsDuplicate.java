class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int count = 0;
        int max ;
        for(int num : nums)
        {
            map.put(num,map.getOrDefault(num,0) + 1);
            if(map.get(num) > 1)
            {
                return true;
            }

        }
        return false;

        
    }
}
// Last updated: 6/15/2025, 5:28:02 PM
class Solution {
    public long continuousSubarrays(int[] nums) {

        TreeMap<Integer,Integer> map = new TreeMap<>();

        int i =0;
        int j = 0;
        int n = nums.length;

        long result = 0;

        while(j < n)
        {
            map.put(nums[j] , map.getOrDefault(nums[j] , 0) + 1);
            while(map.lastEntry().getKey() - map.firstEntry().getKey() > 2)
            {
                map.put(nums[i], map.get(nums[i]) - 1);
                if(map.get(nums[i]) == 0)
                {
                    map.remove(nums[i]);
                }
                i++;
            }

            result += j - i + 1;

            j++;
        }

        return result;
        
    }
}
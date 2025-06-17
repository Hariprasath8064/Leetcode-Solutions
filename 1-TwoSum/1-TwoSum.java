// Last updated: 6/17/2025, 9:58:53 PM
class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        int n  = nums.length;
        Map<Integer,Integer> diff = new HashMap<>();
        for(int i = 0;i<n;i++)
        {
            if(diff.get(nums[i]) != null)
            {
                return new int[] {i, diff.get(nums[i])};
            }
            diff.put(target - nums[i],i);
        }
        
        

        throw new IllegalArgumentException("No suitable solution");
        
        
    }
}
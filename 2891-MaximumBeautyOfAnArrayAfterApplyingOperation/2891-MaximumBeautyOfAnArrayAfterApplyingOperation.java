// Last updated: 6/15/2025, 5:28:01 PM
class Solution
{
    public int maximumBeauty(int[] nums, int k)
    {
        int len = nums.length;
        Arrays.sort(nums);
        int i = 0, j = 0, curr = 0, ans = 1;
        while(i < len && j < len)
        {
            if(nums[i] - k <= nums[j] + k)
            {
                curr++;
                i++;
            }
            else
            {
                curr--;
                j++;
            }
            ans = Math.max(ans, curr);
        }
        return ans;
    }
}
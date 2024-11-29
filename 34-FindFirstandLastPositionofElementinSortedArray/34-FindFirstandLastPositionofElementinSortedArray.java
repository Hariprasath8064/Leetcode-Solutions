class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findfirst(nums,target);
        result[1] = findlast(nums,target);
        return result;  
    }
    public int findfirst(int[] nums, int target)
    {
        int l = 0;
        int r = nums.length - 1;
        int first = -1;
        while(l <= r)
        {
            int mid = l + (r - l)/2;

            if(nums[mid] >= target)
            {
                r = mid - 1;
            }
            else
            {
                l = mid+1;
            }
            if(nums[mid] == target)
            {
                first = mid;
            }
        }
        return first;
    }

    public int findlast(int[] nums, int target)
    {
        int l = 0;
        int r = nums.length - 1;
        int last = -1;
        while(l <= r)
        {
            int mid = l + (r - l)/2;

            if(nums[mid] <= target)
            {
                l = mid + 1;
            }
            else
            {
                r = mid-1;
            }
            if(nums[mid] == target)
            {
                last = mid;
            }
        }
        return last;
    }
}
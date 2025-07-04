// Last updated: 6/15/2025, 5:27:50 PM
class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int[] arr=new int[2];
        
        for(int i=0; i<k; i++){
            arr=getMin(nums);
            nums[arr[1]]=arr[0]*multiplier;
        }
        
        return nums;
    } 
    
    int[] getMin(int[] nums){
        int min=Integer.MAX_VALUE;
        int idx=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<min){
                min=nums[i];
                idx=i;
            }
        }
        
        return new int[]{min,idx};
    }
    
}
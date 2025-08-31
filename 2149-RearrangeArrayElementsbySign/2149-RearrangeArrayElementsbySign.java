// Last updated: 8/31/2025, 11:11:31 PM
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        int posi = 0;
        int negi = 1;

        for(int num:nums){
            if(num >= 0){
                res[posi] = num;
                posi += 2;
            }
            else{
                res[negi] = num;
                negi += 2;
            }
        }
        return res;
    }
}
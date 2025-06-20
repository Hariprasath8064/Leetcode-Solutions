// Last updated: 6/21/2025, 12:18:29 AM
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxk = 0;
        for(int num:piles){
            maxk = Math.max(maxk , num);
        }

        int left = 1;
        int right = maxk;
        int res = maxk;
        while(left <= right){
            int mid = left + (right - left)/2;
            long hours = calh(piles,mid);
            if(hours <= h){
                res = mid;
                right = mid -1;
            }
            else{
                left = mid + 1;
            }
        }
        return res;
        
    }

    private long calh(int [] piles,int mid){
        long h = 0;
        for(int num: piles){
            h += (num + (long)mid - 1) / mid;
        }
        return h;

    }
}
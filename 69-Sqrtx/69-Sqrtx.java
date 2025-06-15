// Last updated: 6/15/2025, 5:29:14 PM
class Solution {
    public int mySqrt(int x) {
        
        if ( x == 0 || x == 1)
        {
            return x;
        }

        int s = 1;
        int e = x;
        int mid = -1;

        while(s <= e)
        {
            mid = s + (e - s) / 2;

            if((long) mid * mid > (long) x)
            {
                e = mid - 1;
            }
            else if (mid * mid == x)
            {
                return mid;
            }
            else
            {
                s = mid + 1;
            }
        }

        return Math.round(e);
    }
}
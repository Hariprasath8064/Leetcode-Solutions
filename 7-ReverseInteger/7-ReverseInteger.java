// Last updated: 7/23/2025, 11:25:40 PM
class Solution {
    public int reverse(int x) {
        int reverse = 0;
        while(x != 0)
        {

            int remainder = x%10;
            if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && remainder > 7)) {
                return 0; 
            }
            if (reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10 && remainder < -8)) {
                return 0; 
            }
            reverse = reverse*10 + remainder;
            x = x/10;
        }

        return reverse;
        
    }
}
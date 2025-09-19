// Last updated: 9/19/2025, 11:56:42 PM
class Solution {
    public boolean isHappy(int n) {
        
        int slow = n;
        int fast = n;
        do {
            slow = square(slow);
            fast = square(square(fast));
        } while (slow != fast);


        return slow == 1;
    }
    public int square(int num) {
        
        int ans = 0;
        
        while(num > 0) {
            int remainder = num % 10;
            ans += remainder * remainder;
            num /= 10;
        }
        
        return ans;
    }
}
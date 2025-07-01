// Last updated: 7/1/2025, 11:16:04 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n < 1){
            return false;
        }
        
    
        while(n % 2 == 0){
            n /= 2;
        }
        if(n == 1){
            return true;
        }
        return false;

    }

}
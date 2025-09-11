// Last updated: 9/11/2025, 11:49:43 PM
class Solution {
    public void reverseString(char[] s) {
        int l = 0 ;
        int r = s.length - 1;
        while(l < r){
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }
}
// Last updated: 6/15/2025, 5:28:05 PM
class Solution {
    public long coloredCells(int n) {
        long x = 1;
        for(int i = 1 ; i < n; i++){
            x += 4*i;
        }
        return x;
        
    }
}
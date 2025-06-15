// Last updated: 6/15/2025, 5:28:18 PM
class Solution {
    public long numberOfWays(String s) {
        int n = s.length();
        long lz = 0 ;
        long lo = 0;
        long rz = 0;
        long ro = 0;
        long count = 0;

        for ( char c : s.toCharArray()){
            if(c == '0'){
                rz++;
            }
            else
            {
                ro++;
            }
        }

        for(char c : s.toCharArray()){
            if(c == '0'){
                rz--;
                count += lo * ro;
                lz++;
            }
            else{
                ro--;
                count += lz * rz;
                lo++;
            }
        }

        return count;

        
    }
}
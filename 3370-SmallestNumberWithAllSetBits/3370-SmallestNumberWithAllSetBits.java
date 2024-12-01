class Solution {
    public int smallestNumber(int n) {
        int bitlength = Integer.toBinaryString(n).length();

        int allsetbits = (int) Math.pow(2,bitlength) - 1;

        if(allsetbits < n)
        {
            allsetbits = (int) Math.pow(2,bitlength + 1) - 1;
        }

        return allsetbits;

        
    }
}
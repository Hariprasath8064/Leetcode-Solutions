// Last updated: 6/15/2025, 5:28:49 PM
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l = 0;
        int r = letters.length - 1;

        while (l <= r)
        {
            int mid = l + (r - l)/2;
            if(letters[mid] <= target)
            {
                l = mid + 1;
            }
            else
            {
                r = mid - 1;
            }
        }
        return letters[l % letters.length];
    


        
    }
}
class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int i = 0, j = 0;
        int n = str1.length();
        int m = str2.length();
        
        while (i < n && j < m) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(j);
            
            if (c1 == c2 || ((c1 + 1 - 'a') % 26 + 'a') == c2) {
                j++;
            }
            i++;
        }
        
        return j == m;
    }
}

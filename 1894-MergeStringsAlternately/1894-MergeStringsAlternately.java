// Last updated: 6/15/2025, 5:28:25 PM
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        char[] result = new char[n + m];

        int i = 0 , j = 0, k = 0;
        while ( i < n || j < m){
            if (i  < n){
                result[k++] = word1.charAt(i++);
            }
            if(j < m){
                result[k++] = word2.charAt(j++);
            }
        }

        return new String(result);
        
        
    }
}
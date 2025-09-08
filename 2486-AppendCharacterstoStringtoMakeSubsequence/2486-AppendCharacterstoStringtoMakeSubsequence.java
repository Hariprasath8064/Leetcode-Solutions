// Last updated: 9/9/2025, 1:03:08 AM
class Solution {
    public int appendCharacters(String s, String t) {
        int i = 0;
        int j = 0;
        while(i< s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)){
                j++;
            }
            i++;
        }
        return t.length()- j;
    }
}
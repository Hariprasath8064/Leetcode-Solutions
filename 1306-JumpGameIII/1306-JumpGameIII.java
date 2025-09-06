// Last updated: 9/6/2025, 6:21:01 PM
class Solution {
    public char repeatedCharacter(String s) {
        int[] array = new int[26];
        for(char c :  s.toCharArray()){
            array[c - 'a'] += 1;
            if(array[c - 'a'] == 2){
                return c;
            }
        }
        return '0';
    }
}
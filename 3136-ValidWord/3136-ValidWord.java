// Last updated: 9/10/2025, 10:55:41 PM
class Solution {
    private static final String VOWELS = "aeiouAEIOU";
    public boolean isValid(String word) {
        if (word.length()< 3){
            return false;
        }
        int v = 0 ;
        int ch = 0;
        for(char c : word.toCharArray()){
            if(Character.isDigit(c)){
                continue;
            }
            if(Character.isLetter(c)){
                if(VOWELS.indexOf(c)>= 0){
                    v++;
                }
                else{
                    ch++;
                }
            }
            else{
                return false;
            }
        }
        return v>0  && ch >0;
    }
}
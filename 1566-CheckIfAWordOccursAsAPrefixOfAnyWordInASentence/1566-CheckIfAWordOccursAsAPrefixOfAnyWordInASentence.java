// Last updated: 6/15/2025, 5:28:32 PM
class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        for(int i = 0;i<words.length;i++)
        {
            if(words[i].startsWith(searchWord))
            {
                return i+1;
            }
        }
        return -1;
        
    }
}
// Last updated: 9/13/2025, 11:13:28 PM
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> ransom = new HashMap<>();
        Map<Character,Integer> mzine = new HashMap<>();
        for ( char c : ransomNote.toCharArray()){
            ransom.put(c,ransom.getOrDefault(c,0)+1);
        }
        for ( char c : magazine.toCharArray()){
            mzine.put(c,mzine.getOrDefault(c,0)+1);
        }
        for(char c: ransom.keySet()){
            if(mzine.getOrDefault(c,0) < ransom.get(c)){
                return false;
            }
        }
        return true;
    }
}
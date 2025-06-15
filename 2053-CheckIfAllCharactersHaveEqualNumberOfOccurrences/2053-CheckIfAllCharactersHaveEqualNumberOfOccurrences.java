// Last updated: 6/15/2025, 5:28:24 PM
class Solution {
    public boolean areOccurrencesEqual(String s) {
        int n = s.length();
        if (n == 1)
        {
            return true;
        }
        Map<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0) + 1);
        }
        int freq = map.get(s.charAt(0));
        for (char key : map.keySet()){
            if(map.get(key) != freq){
                return false;
            }
        }
        return true;
    }
}
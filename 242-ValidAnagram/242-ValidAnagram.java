// Last updated: 6/17/2025, 9:50:35 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();

        for (char c : s.toCharArray()) {
            mapS.put(c, mapS.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if (!mapS.containsKey(c)) {
                return false;
            }

            int newCount = mapT.getOrDefault(c, 0) + 1;

            if (newCount > mapS.get(c)) {
                return false;
            }

            mapT.put(c, newCount);
        }

        return true; 
    }
}
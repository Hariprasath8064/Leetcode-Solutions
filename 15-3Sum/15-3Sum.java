// Last updated: 9/9/2025, 8:55:29 PM
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> map1 = new HashSet<>();
        int count = 0;
        for (int i = 0; i < jewels.length(); i++) {
            char j = jewels.charAt(i);
            map1.add(j);
        }

        for (int i = 0; i < stones.length(); i++) {
            char s = stones.charAt(i);
            if (map1.contains(s)) {
                count++;
            }

        }
        return count;
    }
}
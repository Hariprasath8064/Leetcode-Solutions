// Last updated: 6/17/2025, 10:09:06 PM
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();

        for (String str : strs) {
            boolean added = false;

            for (List<String> group : result) {
                String ref = group.get(0);

                if (ref.length() != str.length()) {
                    continue;
                }

                if (areAnagrams(ref, str)) {
                    group.add(str);
                    added = true;
                    break;
                }
            }

            if (!added) {
                List<String> newGroup = new ArrayList<>();
                newGroup.add(str);
                result.add(newGroup);
            }
        }

        return result;
    }

    private boolean areAnagrams(String s1, String s2) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (char c : s1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        for (char c : s2.toCharArray()) {
            if (!map1.containsKey(c)) return false;

            map2.put(c, map2.getOrDefault(c, 0) + 1);

            if (map2.get(c) > map1.get(c)) return false;
        }

        return true;
    }
}
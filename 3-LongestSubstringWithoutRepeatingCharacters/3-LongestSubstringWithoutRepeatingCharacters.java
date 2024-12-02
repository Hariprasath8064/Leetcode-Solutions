class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int start = 0;
        int maxlength = 0;
        for(int i = 0;i<s.length();i++)
        {
            char current = s.charAt(i);
            if(map.containsKey(current) && map.get(current) >= start)
            {
                start = map.get(current) + 1;
            }

            map.put(current , i);

            maxlength = Math.max(maxlength, i - start + 1);
        }
        return maxlength;
        
    }
}
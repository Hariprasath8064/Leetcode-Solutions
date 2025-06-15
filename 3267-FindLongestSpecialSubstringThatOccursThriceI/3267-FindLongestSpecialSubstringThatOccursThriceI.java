// Last updated: 6/15/2025, 5:27:56 PM
class Solution {
    public int maximumLength(String s) {
        Map<String,Integer> map = new HashMap();
        int n = s.length();
        int l =0;
        for(int i = 0;i<n;i++)
        {
            for(int j = i + 1;j<=n;j++)
            {
                String str = s.substring(i,j);
                if(map.containsKey(str))
                {
                    map.put(str,map.get(str) + 1);
                }
                else
                {
                    map.put(str,1);
                }
            }
        }

        for(Map.Entry<String,Integer> entry : map.entrySet())
        {
            String str = entry.getKey();
            int strcount = entry.getValue();
            if(strcount >= 3)
            {
                Set<Character> set = new HashSet();
                for(int j = 0;j < str.length();j++)
                {
                    set.add(str.charAt(j));
                }

                if (set.size() == 1)
                {
                    l = Math.max(l,str.length());
                }
            }
        }
        return (l == 0) ? -1: l;
        
    }
}
// Last updated: 6/15/2025, 5:28:41 PM
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> fmap = new HashMap <>();

        for(int num : arr){
            fmap.put(num,fmap.getOrDefault(num,0) + 1);
        }

        HashSet<Integer> fset = new HashSet<>(fmap.values());

        return fmap.size() == fset.size();
    }
}
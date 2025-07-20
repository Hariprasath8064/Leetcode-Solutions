// Last updated: 7/20/2025, 11:52:56 PM
class Solution {
    public int findShortestSubArray(final int[] nums) {
        final Map<Integer, Integer> counts = new HashMap<>(), indexes = new HashMap<>();

        int distance = 0, max = 0;

        for(int i = 0; i < nums.length; ++i) {
            final int num = nums[i];

            indexes.putIfAbsent(num, i);

            final int count = counts.getOrDefault(num, 0) + 1;
            counts.put(num, count);

            if(count > max) {
                max = counts.get(num);
                distance = i - indexes.get(num) + 1;
            } else if(max == count) {
                distance = Math.min(distance, i - indexes.get(num) + 1);
            }
        }

        return distance;
    }
}
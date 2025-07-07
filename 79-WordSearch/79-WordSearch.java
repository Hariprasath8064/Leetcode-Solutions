// Last updated: 7/7/2025, 12:16:00 PM
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> merged = new ArrayList<>();
        int[] previous = intervals[0];
        for(int i = 1;i <intervals.length;i++){
            int [] current = intervals[i];
            if (current[0] <= previous[1]){
                previous[1] = Math.max(previous[1],current[1]);
            }
            else{
                merged.add(previous);
                previous = current;
            }
        }
        merged.add(previous);
        return merged.toArray(new int [merged.size()] []);
    }
}
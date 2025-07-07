// Last updated: 7/7/2025, 12:35:56 PM

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> merged = new ArrayList<>();
        int i = 0;
        int n = intervals.length;
        while(i < n && intervals[i][1] < newInterval[0]){
            merged.add(intervals[i]);
            i++;
        }
        while(i < n && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(intervals[i][0],newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1],newInterval[1]);
            i++;
        }
        merged.add(newInterval);
        while(i < n){
            merged.add(intervals[i]);
            i++;
        }
        return merged.toArray(new int [merged.size()] []);
    }
}
class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        int[] result = new int[n];
        
    
        int[][] starts = new int[n][2];
        for (int i = 0; i < n; i++) {
            starts[i] = new int[]{intervals[i][0], i};
        }
        
        
        Arrays.sort(starts, (a, b) -> Integer.compare(a[0], b[0]));
        
        for (int i = 0; i < n; i++) {
            int target = intervals[i][1];
            int found = binarySearch(starts, target);
            result[i] = found;
        }
        
        return result;
    }
    
    private int binarySearch(int[][] starts, int target) {
        int left = 0, right = starts.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (starts[mid][0] >= target) {
                
                if (mid == 0 || starts[mid-1][0] < target) {
                    return starts[mid][1];
                }
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        return -1;
    }
}
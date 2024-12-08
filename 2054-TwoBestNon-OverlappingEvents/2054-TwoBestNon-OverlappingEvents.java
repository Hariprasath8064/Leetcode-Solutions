import java.util.*;

class Solution {
    public int maxTwoEvents(int[][] events) {
        // Step 1: Sort events by their end times
        Arrays.sort(events, (a, b) -> Integer.compare(a[1], b[1]));

        int n = events.length;
        int[] maxValues = new int[n];
        maxValues[0] = events[0][2]; // Value of the first event

        // Fill the running max array
        for (int i = 1; i < n; i++) {
            maxValues[i] = Math.max(maxValues[i - 1], events[i][2]);
        }

        int maxSum = 0;

        // Step 3: Iterate through the events and use binary search
        for (int i = 0; i < n; i++) {
            int start = events[i][0];
            int value = events[i][2];

            // Find the latest event that ends before the current event starts
            int idx = binarySearch(events, start - 1);

            int currentSum = value;
            if (idx != -1) currentSum += maxValues[idx];

            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    // Helper: Binary search to find the latest event that ends <= targetEnd
    private int binarySearch(int[][] events, int targetEnd) {
        int start = 0, end = events.length - 1, res = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (events[mid][1] <= targetEnd) {
                res = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return res;
    }
}
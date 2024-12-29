class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // Check for all subarrays of length between l and r
        for (int size = l; size <= r; size++) {
            int i = 0, j = 0, sum = 0;
            while (j < nums.size()) {
                sum += nums.get(j);
                // Adjust the window size
                if (j - i + 1 < size) {
                    j++;
                } else if (j - i + 1 == size) {
                    // Add to the priority queue only if sum > 0
                    if (sum > 0) {
                        pq.offer(sum);
                    }
                    sum -= nums.get(i); // Slide the window
                    i++;
                    j++;
                }
            }
        }
        // Return the minimum sum if valid subarrays exist, otherwise -1
        return pq.isEmpty() ? -1 : pq.peek();
    }
}

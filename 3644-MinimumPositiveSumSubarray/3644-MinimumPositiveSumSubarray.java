// Last updated: 6/15/2025, 5:27:41 PM
class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int size = l; size <= r; size++) {
            int i = 0, j = 0, sum = 0;
            while (j < nums.size()) {
                sum += nums.get(j);
                if (j - i + 1 < size) {
                    j++;
                } else if (j - i + 1 == size) {
                    if (sum > 0) {
                        pq.offer(sum);
                    }
                    sum -= nums.get(i); 
                    i++;
                    j++;
                }
            }
        }
        // Return the minimum sum if valid subarrays exist, otherwise -1
        return pq.isEmpty() ? -1 : pq.peek();
    }
}
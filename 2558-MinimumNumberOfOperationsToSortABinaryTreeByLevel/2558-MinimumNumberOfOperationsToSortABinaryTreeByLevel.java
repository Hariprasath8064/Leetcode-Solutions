// Last updated: 6/15/2025, 5:28:11 PM
import java.util.*;

class Solution {
    public int minimumOperations(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        int count = 0;
        queue.offer(root);

        while (!queue.isEmpty()) {
            int n = queue.size();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                    list.add(node.left.val);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                    list.add(node.right.val);
                }
            }

            count += minimumSwapsToSort(list);
        }

        return count;
    }

    private int minimumSwapsToSort(List<Integer> list) {
        int n = list.size();
        int[] arr = new int[n];
        int[] sorted = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = list.get(i);
            sorted[i] = list.get(i);
        }

        Arrays.sort(sorted);
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            indexMap.put(sorted[i], i);
        }

        boolean[] visited = new boolean[n];
        int swaps = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i] || arr[i] == sorted[i]) {
                continue;
            }

            int cycleSize = 0;
            int j = i;

            while (!visited[j]) {
                visited[j] = true;
                j = indexMap.get(arr[j]);
                cycleSize++;
            }

            if (cycleSize > 1) {
                swaps += cycleSize - 1;
            }
        }

        return swaps;
    }
}

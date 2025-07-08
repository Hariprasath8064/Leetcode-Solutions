// Last updated: 7/8/2025, 11:59:09 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        return depth(root)[0] == 1;
    }
    public int[] depth(TreeNode root){
        if(root == null){
            return new int[] {1,0};
        }
        int[] r = depth(root.right);
        int[] l = depth(root.left);
        boolean b = (l[0] == 1 && r[0] == 1) && 
                            (Math.abs(l[1] - r[1]) <= 1);
        int height = 1 + Math.max(l[1], r[1]);

        return new int[]{b ? 1 : 0, height};
    }
}
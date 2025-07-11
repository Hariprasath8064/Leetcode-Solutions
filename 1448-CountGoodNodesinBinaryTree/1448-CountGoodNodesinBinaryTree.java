// Last updated: 7/11/2025, 11:35:03 PM
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
    public int goodNodes(TreeNode root) {
        int maxvalue = root.val;
        int res = search(root,maxvalue);
        return res;
    }
    public int search(TreeNode root, int maxvalue){
        int res = 0;
        if(root == null){
            return res;
        }
        if(root.val >= maxvalue){
            maxvalue = root.val;
            res = 1;
        }
        res += search(root.right,maxvalue);
        res += search(root.left,maxvalue);

        return res;
    }

}
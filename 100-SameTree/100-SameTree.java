// Last updated: 7/10/2025, 7:52:52 PM
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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot == null){
            return true;
        }
        if(root == null){
            return false;
        }
        if(sametree(root,subRoot) == true){
            return true;
        }
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);

    }
    public boolean sametree(TreeNode p , TreeNode q){
        if (p == null && q == null){
            return true;
        }
        if(p == null || q == null || p.val != q.val){
            return false;
        }
        return sametree(p.left,q.left) && sametree(p.right,q.right);
    }
}
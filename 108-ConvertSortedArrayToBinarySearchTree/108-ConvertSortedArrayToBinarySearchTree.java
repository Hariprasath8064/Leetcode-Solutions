// Last updated: 6/15/2025, 5:29:13 PM
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
    public TreeNode sortedArrayToBST(int[] nums) {
        return result(nums,0,nums.length - 1);
        
    }
    public TreeNode result(int [] nums , int left , int right){
        if(left > right) return null;
        int mid = (left + right)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = result(nums,left,mid - 1);
        root.right = result(nums,mid+1,right);
        return root;

    }
}
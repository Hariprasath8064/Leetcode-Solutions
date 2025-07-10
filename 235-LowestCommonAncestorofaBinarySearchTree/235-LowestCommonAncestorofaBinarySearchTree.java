// Last updated: 7/10/2025, 11:23:48 PM
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(root,0,res);
        return res;
    }
    public void dfs(TreeNode p , int count , List<List<Integer>> res){
        if(p == null){
            return;
        }
        if(res.size() == count){
            res.add(new ArrayList<>());
        }
        res.get(count).add(p.val);

        dfs(p.left,count+1,res);
        dfs(p.right,count+1,res);

    }
}
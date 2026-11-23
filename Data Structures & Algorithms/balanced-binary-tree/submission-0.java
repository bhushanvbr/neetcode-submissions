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
    boolean isBalanced;
    public boolean isBalanced(TreeNode root) {
        isBalanced = true;
        dfs(root);
        return isBalanced;
    }
    private int dfs(TreeNode node){
        if(!isBalanced) return 0;
        if(node == null) return 0;
        int heightLeft = dfs(node.left);
        int heightRight = dfs(node.right);
        if(Math.abs(heightLeft - heightRight) > 1) {
            isBalanced = false;
            return 0 ;
        }else{
            return (Math.max(heightLeft,heightRight)) +1;
        }
    }
}

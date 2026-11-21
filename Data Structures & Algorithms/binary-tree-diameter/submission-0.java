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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        int[] maxHeightAndDia = new int[]{0,0};//0-> maxHeight, 1->maxDia
        maxHeightAndDia = dfs(root,maxHeightAndDia);
        return maxHeightAndDia[1];
    }
    private int[] dfs(TreeNode node, int[] maxHeightAndDia){
        if(node == null ) return new int[]{0,0};
        int heightLeft = dfs(node.left,maxHeightAndDia)[0];
        int heightRight = dfs(node.right,maxHeightAndDia)[0];
        maxHeightAndDia[0] = Math.max(heightLeft,heightRight)+1;
        maxHeightAndDia[1] = Math.max(maxHeightAndDia[1],heightLeft+heightRight);
        return maxHeightAndDia;
    }
}

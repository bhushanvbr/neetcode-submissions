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
    public TreeNode invertTree(TreeNode root) {
        if(root == null)return null;
        Deque<TreeNode> nodes = new ArrayDeque<>();
        nodes.push(root);
        while(!nodes.isEmpty()){
            TreeNode node = nodes.pop();
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
            if (node.left != null)nodes.push(node.left);
            if(node.right != null)nodes.push(node.right);
        }
        return root;
    }
}

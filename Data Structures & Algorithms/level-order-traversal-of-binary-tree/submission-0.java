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
       
        List<List<Integer>> allLevelNodeList = new ArrayList<>();
        if(root == null) return allLevelNodeList;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> currentLevelNodeList = new ArrayList<>(size);
            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                currentLevelNodeList.add(node.val);
                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
            }
            allLevelNodeList.add(currentLevelNodeList);
        }
        return allLevelNodeList;
    }
}
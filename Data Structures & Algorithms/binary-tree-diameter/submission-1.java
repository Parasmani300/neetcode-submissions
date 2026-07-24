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
    static class Pair{
        int diameter;
        int height;

        public Pair(int diameter,int height)
        {
            this.diameter = diameter;
            this.height = height;
        }
    }

    public Pair helper(TreeNode root)
    {
        if(root == null)
            return new Pair(0,0);

        Pair left = helper(root.left);
        Pair right = helper(root.right);

        int height = 1 + Math.max(left.height,right.height);
        int diameterThroughNode = left.height + right.height;
        int diameter = Math.max(diameterThroughNode,Math.max(left.diameter,right.diameter));
        return new Pair(diameter,height);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null)
            return 0;
        return helper(root).diameter;
    }
}

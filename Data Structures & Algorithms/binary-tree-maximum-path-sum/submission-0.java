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
    private int max = Integer.MIN_VALUE;

    public int maxGain(TreeNode root)
    {
        if(root == null)
            return 0;

        int leftGain = Math.max(maxGain(root.left),0);
        int rightGain = Math.max(maxGain(root.right),0);

        int newPathSum = root.val + leftGain +  rightGain;
        max = Math.max(max,newPathSum);

        return root.val + Math.max(leftGain,rightGain);
    }
    public int maxPathSum(TreeNode root) {
        maxGain(root);
        return max;
    }
}

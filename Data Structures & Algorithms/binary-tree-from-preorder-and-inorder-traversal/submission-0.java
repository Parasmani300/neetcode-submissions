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
    int preIdx = 0;
    Map<Integer,Integer> map = new HashMap<>();
    public TreeNode build(int[] preOrder,int inStart,int inEnd)
    {
        if(inStart > inEnd)
            return null;

        int rootVal = preOrder[preIdx++];
        TreeNode root = new TreeNode(rootVal);

        int rootIdxInorder = map.get(rootVal);
        root.left = build(preOrder,inStart,rootIdxInorder-1);
        root.right = build(preOrder,rootIdxInorder+1,inEnd);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i = 0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }

        return build(preorder,0,inorder.length-1);
    }
}

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
        List<List<Integer>> list = new ArrayList<>();
        if(root == null)
            return list;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        List<Integer> subList = new ArrayList<>();
        while(!queue.isEmpty())
        {
            TreeNode currentNode = queue.remove();

            if(currentNode == null)
            {
                if(queue.isEmpty())
                {
                    list.add(subList);
                    break;
                }else{
                    list.add(subList);
                    subList = new ArrayList<>();
                    queue.add(null);
                }

            }else{
                subList.add(currentNode.val);
                if(currentNode.left != null)
                    queue.add(currentNode.left);
                if(currentNode.right != null)
                    queue.add(currentNode.right);
            }
        }

        return list;
    }
}

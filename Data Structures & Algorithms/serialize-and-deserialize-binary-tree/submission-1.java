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

public class Codec {
    public void buildString(TreeNode root,StringBuilder sb)
    {
        if(root == null)
        {
            sb.append("#,");
            return;
        }

        sb.append(root.val).append(",");
        buildString(root.left,sb);
        buildString(root.right,sb);
    }

    public TreeNode buildTree(Queue<String> queue)
    {
        String node = queue.poll();
        if(node.equals("#"))
            return null;

        TreeNode root = new TreeNode(Integer.parseInt(node));
        root.left = buildTree(queue);
        root.right = buildTree(queue);
        return root;
    }
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        buildString(root,sb);
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> nodes = new LinkedList<>(Arrays.asList(data.split(",")));
        return buildTree(nodes);
    }
}

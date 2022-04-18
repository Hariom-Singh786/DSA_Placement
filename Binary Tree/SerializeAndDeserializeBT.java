/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null)return "";
        Queue<TreeNode>q= new LinkedList<>();
        StringBuilder ans = new StringBuilder();
        q.add(root);
        while(!q.isEmpty())
        {
            TreeNode temp= q.poll();
            if(temp==null)
            {
                ans.append("n ");
                continue;
            }
            ans.append(temp.val + " ");
            q.add(temp.left);
            q.add(temp.right);
        }
        return ans.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data=="")return null;
        Queue<TreeNode>q = new LinkedList<>();
        String[]val = data.split(" ");
        TreeNode node = new TreeNode(Integer.parseInt(val[0]));
        q.add(node);
        for(int i=1;i<val.length;i++)
        {
            TreeNode parent = q.poll();
            if(!val[i].equals("n"))
            {
                TreeNode left = new TreeNode(Integer.parseInt(val[i]));
                parent.left = left;
                q.add(left);
            }
            if(!val[++i].equals("n"))
            {
                TreeNode right = new TreeNode(Integer.parseInt(val[i]));
                parent.right = right;
                q.add(right);
            }
        }
        return node;
    }
}

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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        // base case if root == null
        if(root==null) return new TreeNode(val);
        TreeNode pointer = root;
        while(true)
        {
            if(pointer.val < val)
            {
                if(pointer.right!=null)
                {
                    pointer= pointer.right;
                }
                else
                {
                    pointer.right = new TreeNode(val);
                    break;
                }
            }
            else
            {
                if(pointer.left!=null)
                {
                    pointer=pointer.left;
                }
                else
                {
                    pointer.left = new TreeNode(val);
                    break;
                }
            }
        }
        return root;
    }
}

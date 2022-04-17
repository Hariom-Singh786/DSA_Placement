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
    public int countNodes(TreeNode root) {
        if(root==null)return 0;
        //getting count for left sub tree
        int left = getLeftHeight(root);
        int right = getRightHeight(root);
        if(left==right)
            return ((2<<left)-1); // means 2 raise to the power left -1
        else
            return countNodes(root.left)+countNodes(root.right) + 1;
        
    }
    public int getLeftHeight(TreeNode root)
    {
        int c=0;
        while(root.left!=null)
        {
            c++;
            root = root.left;
        }
        return c;
    }
    public int getRightHeight(TreeNode root)
    {
        int c=0;
        while(root.right!=null)
        {
            c++;
            root = root.right;
        }
        return c;
    }
}

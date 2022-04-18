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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        //base condition
        if(inorder==null || postorder==null || inorder.length!=postorder.length)
        {
            return null;
        }
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        {
            map.put(inorder[i],i);
        }
        TreeNode root = buildTree(inorder,0,inorder.length-1,postorder,0,postorder.length-1,map);
        return root;
    }
    private TreeNode buildTree(int []inorder, int is, int ie, int[]postorder, int ps,int pe, HashMap<Integer,Integer>map)
    {
        if(is>ie || ps>pe)return null;
        TreeNode root = new TreeNode(postorder[pe]);
        int inroot = map.get(postorder[pe]);
        int numleft = inroot-is;
        root.left = buildTree(inorder, is,inroot-1,postorder,ps,ps+numleft-1,map);
        root.right = buildTree(inorder, inroot+1,ie,postorder,ps+numleft,pe-1,map);
        return root;
    }
}

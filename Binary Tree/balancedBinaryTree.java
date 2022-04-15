class Solution {
    public boolean isBalanced(TreeNode root) {
      return findingSolution(root)!=-1;  // doesn't equal to -1 then return true else return false     
    }
  static int findingSolution(TreeNode root)
  {
    if(root == null)return 0;
    int lh = findingSolution(root.left);
    if(lh==-1)return -1;
    int rh = findingSolution(root.right);
    if(rh==-1)return -1;
    if(Math.abs(lh-rh)>1) return -1;
    return Math.max(lh,rh)+1;
  }
}

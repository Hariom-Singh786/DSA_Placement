public class Solution {
	public static int diameterOfBinaryTree(TreeNode<Integer> root) {
		int [] dm = new int[1];
		height(root,dm);
		return dm[0];
	}
	static int height(TreeNode<Integer> root, int[] dm)
	{
		if(root==null)return 0;
		int lh = height(root.left,dm);
		int rh = height(root.right,dm);
		dm[0]= Math.max(dm[0],lh+rh);
		return 1 + Math.max(lh,rh);
	}
}

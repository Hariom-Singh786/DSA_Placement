
   class TreeNode {
	    int data;
	    TreeNode left;
	    TreeNode right;

	    TreeNode(int data) {
		    this.data = data;
		    this.left = null;
		    this.right = null;
	    }

    }
    

import java.util.ArrayList;

public class Solution {
	public static void ArrayList<Integer> traverseBoundary(TreeNode root){
		ArrayList<Integer>ans = new ArrayList<>();
		if(isLeaf(root)==false)
		{
			ans.add(root.data);	
		}	
		leftBoundary(root.left,ans);
		addLeaf(root,ans);
		rightBoundary(root.right,ans);
		return ans;
	}
	static boolean isLeaf(TreeNode root)
	{
		return (root.left==null)&&(root.right==null);
	}
	static void leftBoundary(TreeNode node, ArrayList<Integer>ans)
	{
		TreeNode curr = node;
		while(curr!=null)
		{
			if(isLeaf(curr)==false)
				ans.add(curr.data);
			if(curr.left!=null)
				curr=curr.left;
			else
				curr=curr.right;
		}
	}
	static void addLeaf(TreeNode node, ArrayList<Integer>ans)
	{
		if(isLeaf(node))
		{
			ans.add(node.data);
			return;
		}
		if(root.left!=null)
			addLeaf(node.left,ans);
		if(root.right!=null)
			addLeaf(node.right,ans);
	}
	static void rightBoundary(TreeNode node, ArrayList<Integer>ans)
	{
		TreeNode curr= node.right;
		ArrayList<Integer>tmp= new ArrayList<>();
		while(curr!=null)
		{
			if(isLeaf(curr)==false)
				tmp.add(curr.data);
			if(curr.right!=null)
				curr=curr.right;
			else
				curr=curr.left;
		}
		for(int i=tmp.size()-1;i>=0;--i)
		{
			ans.add(tmp.get(i));
		}
	}
}

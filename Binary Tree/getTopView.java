/************************************************************

    Following is the TreeNode class structure:

    class BinaryTreeNode {
		int val;
		BinaryTreeNode left;
		BinaryTreeNode right;

		BinaryTreeNode(int val) {
			this.val = val;
			this.left = null;
			this.right = null;
		}
	}

************************************************************/
 public  class  Pair {
	BinaryTreeNode node ;
	int hd;
	public Pair(BinaryTreeNode node,int hd)
	{
		node = node;
		hd = hd;
	}
}
public class Solution {

	public static ArrayList<Integer> getTopView(BinaryTreeNode root) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		if(root==null)return ans;
		Queue<Pair>q= new LinkedList<Pair>();
		Map<Integer,Integer>map = new TreeMap<>();
		q.add(new Pair(root,0));
		while(!q.isEmpty())
		{
			Pair it = q.remove();
			int hd = it.hd;
			BinaryTreeNode temp = it.node;
			if(map.get(hd)==null)
			{
				map.put(hd,temp.val);
			}
			if(temp.left!=null)
			{
				q.add(new Pair(temp.left,hd-1));
			}
			if(temp.right!=null)
			{
				q.add(new Pair(temp.right,hd+1));
			}
		}
		for(Map.Entry<Integer,Integer> entry:map.entrySet())
		{
			ans.add(entry.getValue());
		}
		return ans;
	}
}

/*********************************************

    class BinaryTreeNode {
        int val;
        BinaryTreeNode left;
        BinaryTreeNode right;
		int hd=0;

        BinaryTreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

*********************************************/


public class Solution {
    public static ArrayList<Integer> bottomView(BinaryTreeNode root) {
        ArrayList<Integer>ans = new ArrayList<>();
		if(root==null)return ans;
		Map<Integer,Integer>map = new TreeMap<>();
		Queue<BinaryTreeNode>q=new LinkedList<BinaryTreeNode>();
		root.hd =0;
		q.add(root);
		while(!q.isEmpty())
		{
			BinaryTreeNode temp = q.remove();
			int hd = temp.hd;
			map.put(hd,temp.val);
			if(temp.left!=null)
			{
				temp.left.hd = hd-1;
				q.add(temp.left);
			}
			if(temp.right!=null)
			{
				temp.right.hd = hd+1;
				q.add(temp.right);
			}
			
		}
		for(Map.Entry<Integer,Integer>entry:map.entrySet())
		{
			ans.add(entry.getValue());
		}
		return ans;
		
    }
}

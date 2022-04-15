public class Solution
{
public static ArrayList<Integer> spiralOrder(BinaryTreeNode<Integer> root)
    {
        Queue<BinaryTreeNode>q = new LinkedList<BinaryTreeNode>();
		ArrayList<Integer>result = new ArrayList<Integer>();
		if(root==null)return result;
	q.offer(root);
	boolean flag = true;
	while(!q.isEmpty())
	{
		int size = q.size();
		for(int i=0;i<size;i++)
		{
			if(q.peek().left!=null)
				q.offer(q.peek().left);
			if(q.peek().right!=null)
				q.offer(q.peek().right);
			if(flag==true)
				result.add(q.poll().data);
			else
				result.add(0,q.poll().data);
			
		}
		flag=!flag;
	}
	return result;
    }
}

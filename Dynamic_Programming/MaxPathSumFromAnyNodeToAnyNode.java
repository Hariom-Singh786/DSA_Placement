package Dynamic_Programming;

/*Given a non-empty binary tree, find the maximum path sum.

For this problem, a path is defined as any sequence of nodes from some starting node to any node in the tree along the
 parent-child connections. The path must contain at least one node and does not need to go through the root.

Example 1:

Input: [1,2,3]

       1
      / \
     2   3

Output: 6
Example 2:

Input: [-10,9,20,null,null,15,7]

   -10
   / \
  9  20
    /  \
   15   7

Output: 42*/

public class MaxPathSumFromAnyNodeToAnyNode {
    public static void main(String[] args) {
      Node root = new Node(-10);
      root.left = new Node(9);
      root.right=new Node(20);
      root.right.left=new Node(15);
      root.right.right=new Node(7);
        System.out.println(maxSum(root));
    }
    static class Node{
        int data;
        Node left, right;
        public Node(int data)
        {
            this.data = data;
        }
    }
    static class A{
        int ans = Integer.MIN_VALUE;
    }
    static int PathSum(Node root, A res)
    {
        if(root==null)return 0;
        int left = PathSum(root.left,res);
        int right = PathSum(root.right,res);
        int temp = Math.max(Math.max(left,right)+root.data,root.data);
        int ans = Math.max(temp,left+right+root.data);
        res.ans=Math.max(res.ans,left+right+root.data);
        return temp;
    }
    static int maxSum(Node root)
    {
        if(root==null)return 0;
        A a = new A();
        int sum = PathSum(root,a);
        return a.ans;
    }
}

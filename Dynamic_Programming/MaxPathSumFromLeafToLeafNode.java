package Dynamic_Programming;

/*Maximum path sum from leaf to leaf

If a binary tree is given, how to find Maximum path sum between two leaves of binary tree.

All should be numbers
The maximum sum path may or may not go through root.
For example, in the following binary tree, the maximum sum is 27(3 + 6 + 9 + 0 – 1 + 10). Expected time complexity is O(n).

  -15
 /  \
       5    6
      / \  / \
    -8  1  3  9
    / \       \
   2   6       0
       / \
      4  -1
  /
        10*/
public class MaxPathSumFromLeafToLeafNode {
    public static void main(String[] args) {
        Node root = new Node(-15);
        root.left = new Node(5);
        root.right = new Node(6);
        root.left.left = new Node(-8);
        root.left.right = new Node(1);
        root.left.left.left = new Node(2);
        root.left.left.right = new Node(6);
        root.right.left = new Node(3);
        root.right.right = new Node(9);
        root.right.right.right = new Node(0);
        root.right.right.right.left = new Node(4);
        root.right.right.right.right = new Node(-1);
        root.right.right.right.right.left = new Node(10);
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
        int temp = Math.max(left,right)+root.data;
        if(root.left==null && root.right==null)
        {
            temp= Math.max(temp,root.data);
        }
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

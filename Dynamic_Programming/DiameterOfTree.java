package Dynamic_Programming;

public class DiameterOfTree {
    public static void main(String[] args) {
//        Node root = new Node(2);
//        root.left = new Node(3);
//        root.right= new Node(5);
//        root.left.left= new Node(7);
//        root.right.right= new Node(8);
//        root.right.left= new Node(10);
//        root.left.left.right= new Node(11);

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println(diameter(root));
    }
    static class Node{
        int data;
        Node left,right;
        public Node(int data)
        {
            this.data=data;
        }
    }
    static  class A{
        int ans=Integer.MIN_VALUE;
    }
    static int height(Node root,A res)
    {
        if(root==null)return 0;
        int left = height(root.left,res);
        int right=height(root.right,res);
        res.ans=Math.max(res.ans,1+left+right);
        return 1 + Math.max(left,right);
    }
    static int diameter(Node root)
    {
        if(root==null)return 0;
        A a = new A();
        int height = height(root,a);
        return a.ans;
    }
}

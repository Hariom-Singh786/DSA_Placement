public Node{
  Node left;
  Node right;
  int data;
  Node(int data)
  {
    this.data=data;
  } 
}
Node ceilBST(Node root, int key)
{
  int ceil=-1;
  while(root!=null)
  {
    if(root.data==key)
      ceil=root.data;
    return ceil;
    if(root.data<key)
      root=root.right;
    else
      ceil= root.data;
      root= root.left
  }
  return ceil
} 

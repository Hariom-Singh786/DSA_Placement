public class Solution {

    public static int floorInBST(TreeNode<Integer> root, int X) {
      int floor =-1;
      while(root!=null)
      {
        if(root.data==X){
          floor=root.data;
          return floor;
        }
        if(X<root.data){
          root = root.left;
        }
        else{
          floor = root.data;
          root = root.right;
        }
      }
      return floor;
    }
}

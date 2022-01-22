package Recursion.KunalSheet;

//find maximum and minimum element in an array
public class MaxAndMinInArray {
    public static void main(String[] args) {
        int []arr= {9,-3,8,6,18,-8,23,4,9};
        System.out.println("Max value :"+findMax(arr,arr.length));
        System.out.println("Min Value :"+findMin(arr, arr.length));
    }
    static int findMax(int []arr,int n)
    {
        if(n==1)
        {
            return arr[0];
        }
        return Math.max(arr[n-1],findMax(arr,n-1));
    }
    static int findMin(int[]arr, int n)
    {
        if(n==1)
        {
            return arr[0];
        }
        return Math.min(arr[n-1],findMin(arr,n-1));
    }
//  static int [] maxNdMin(int[]arr, int ma, int mi, int n)
//  {
//      if(n==1)
//      {
//          return new int[]{ma,mi};
//      }
//      ma=Math.max(ma,maxNdMin(arr[n-1],ma,mi,n-1));
//      mi=Math.min(mi,maxNdMin(arr[n-1],ma,mi,n-1));
//      return new int[]{ma,mi};
//  }
}

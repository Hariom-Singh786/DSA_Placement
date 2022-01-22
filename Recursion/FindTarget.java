package Recursion;

public class FindTarget {
    public static void main(String[] args) {
    int [] arr= {3,2,1,6,8,10};
//        System.out.println(found(arr,0,11));
//        System.out.println(foundIndex(arr,0,9));
        System.out.println(finding(arr,0,19));
    }
    static boolean found(int[]arr, int index,int target)
    {
        if(index==arr.length-1 && arr[index]!=target)
        {
            return false;
        }
        if(arr[index]!=target)
        {
           return found(arr,index+1,target);
        }
        return  true;
    }
    static int foundIndex(int []arr, int index, int target)
    {
        if(arr[index]==target)
        {
            return index;
        }
        if(arr[index]!=target)
        {
            return foundIndex(arr,index+1,target);
        }
        return -1;
    }
    static boolean finding(int[]arr, int index, int target)
    {
        if(index==arr.length)
        {
            return false;
        }
        return arr[index]==target || finding(arr,index+1,target);
    }

}
